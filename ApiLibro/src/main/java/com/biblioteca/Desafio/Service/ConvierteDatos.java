package com.biblioteca.Desafio.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {

    private ObjectMapper Mapper = new ObjectMapper();

    @Override
    public <T> T obtenerDatos(String json,Class<T> clase) {
        try {
            return Mapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
