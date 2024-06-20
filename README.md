# Biblioteca Desafío

Este proyecto es una aplicación de consola en Java que permite buscar y analizar información sobre libros utilizando la API de Gutendex. La aplicación permite realizar varias operaciones, como mostrar los primeros libros encontrados, listar los libros más descargados, buscar libros específicos por nombre y obtener estadísticas sobre las descargas de los libros.

## Funcionalidades

- **Mostrar los primeros 5 libros**: Muestra los primeros cinco libros obtenidos de la API.
- **Top 10 libros más descargados**: Muestra los diez libros con mayor número de descargas.
- **Buscar libros por nombre**: Permite buscar libros específicos por su título.
- **Estadísticas de descargas**: Proporciona estadísticas como la media, el número máximo y mínimo de descargas, y la cantidad total de libros.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes y clases:

- **Principal**: Contiene la clase `principal` que maneja la lógica de la aplicación.
- **Service**: Contiene las clases `ConsumoAPI` para realizar las llamadas a la API y `ConvierteDatos` para convertir los datos JSON a objetos Java.
- **Model**: Contiene las clases de datos `Datos`, `Datoslibros`.

## Cómo Ejecutar la Aplicación

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/tu_usuario/biblioteca-desafio.git
    ```
2. **Navega al directorio del proyecto**:
    ```bash
    cd biblioteca-desafio
    ```
3. **Compila el proyecto**:
    ```bash
    javac -d bin src/com/biblioteca/Desafio/Principal/principal.java
    ```
4. **Ejecuta la aplicación**:
    ```bash
    java -cp bin com.biblioteca.Desafio.Principal.principal
    ```

## Dependencias

El proyecto no tiene dependencias externas específicas, solo utiliza las bibliotecas estándar de Java.

## Uso de la Aplicación

Al ejecutar la aplicación, se mostrará un menú donde podrás realizar las siguientes acciones:

1. **Mostrar los primeros libros**:
   - La aplicación mostrará los primeros cinco libros obtenidos de la API.

2. **Top 10 libros más descargados**:
   - La aplicación mostrará los diez libros con el mayor número de descargas.

3. **Buscar libro por nombre**:
   - Se solicitará ingresar el nombre del libro que deseas buscar y se mostrarán los detalles si se encuentra el libro.

4. **Estadísticas de descargas**:
   - La aplicación mostrará estadísticas sobre el número de descargas de los libros, incluyendo la media, el número máximo y mínimo de descargas, y la cantidad total de libros.

## Ejemplo de Uso

1. **Buscar libros y mostrar los primeros 5**:
    ```plaintext
    Datoslibros[titulo=Romeo and Juliet, autor=[DatosAutor[nombre=Shakespeare, William, fechaDeNacimiento=1564]], idiomas=[en], numeroDescargas=67717.0]
    Datoslibros[titulo=Moby Dick, autor=[DatosAutor[nombre=Melville, Herman, fechaDeNacimiento=1819]], idiomas=[en], numeroDescargas=60000.0]
    ...
    ```

2. **Top 10 libros más descargados**:
    ```plaintext
    TOP 10
    ROMEO AND JULIET
    MOBY DICK
    ...
    ```

3. **Buscar libro por nombre**:
    ```plaintext
    Que libro deseas buscar?
    Moby Dick
    Episodio encontrado
    Los datos son: Datoslibros[titulo=Moby Dick, autor=[DatosAutor[nombre=Melville, Herman, fechaDeNacimiento=1819]], idiomas=[en], numeroDescargas=60000.0]
    ```

4. **Estadísticas de descargas**:
    ```plaintext
    Media: 50000.0
    Numero mayor de descargas: 67717.0
    Numero menor de descargas: 30000.0
    Cantidad de registros: 10
    ```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).

