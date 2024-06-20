package com.biblioteca.Desafio.Principal;

import com.biblioteca.Desafio.Service.ConsumoAPI;
import com.biblioteca.Desafio.Service.ConvierteDatos;
import com.biblioteca.Desafio.model.Datos;
import com.biblioteca.Desafio.model.Datoslibros;

import java.util.*;
import java.util.stream.Collectors;

public class principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI= new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books/";
    private final String BUSQUEDA_API = "?search=";
    private ConvierteDatos conversor = new ConvierteDatos();
    public void mostrarMenu(){
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json,Datos.class);
        System.out.println("Datos");


        //mostrar los primeros libros
        List<Datoslibros> libros = datos.resultados();

        // Limita la lista de libros a los primeros 5
        List<Datoslibros> primerosCincoLibros = libros.stream()
                .limit(5)
                .collect(Collectors.toList());

        // Imprime los primeros 5 libros
        primerosCincoLibros.forEach(System.out::println);

        //top 10 mas descargados
        System.out.println("Top 10");
        libros.stream()
                .sorted(Comparator.comparing(Datoslibros::numeroDescargas).reversed())
                .map(e-> e.titulo().toUpperCase())
                .limit(10)
                .forEach(System.out::println);
        //buscar libro
        System.out.println("Que libro deseas buscar?");
        var nombreLibro = teclado.nextLine();
        json = consumoAPI.obtenerDatos(URL_BASE +BUSQUEDA_API + nombreLibro.replace(" ","%20"));
        var datosLibros = conversor.obtenerDatos(json,Datos.class);
        Optional<Datoslibros> libroBuscado = datosLibros.resultados().stream()
                .filter(e -> e.titulo().toUpperCase().contains(nombreLibro.toUpperCase()))
                .findFirst();
        if(libroBuscado.isPresent()){
            System.out.println(" Episodio encontrado"
                    + "\n Los datos son:" + libroBuscado.get());
        }else {
            System.out.println("episodio no encontrado");
        }



        // Uso de estadisticas con la api
        DoubleSummaryStatistics  est = datos.resultados().stream()
                        .collect(Collectors.summarizingDouble(Datoslibros::numeroDescargas));
        System.out.println("Media:" + est.getAverage() +
                "\n Numero mayor de descargas:" + est.getMax() +
                "\n Numero menor de descargas:" + est.getMin() +
                "\n Cantidad de registros:" + est.getCount());




    }
}
