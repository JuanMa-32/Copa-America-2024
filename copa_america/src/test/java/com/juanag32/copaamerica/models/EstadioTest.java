package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstadioTest {

    @Test
    void testCrearEstadio() {
        //given
        Estadio estadio = new Estadio();

        estadio.setNombre("bombonera");
        estadio.setCapacidad(82300);
        estadio.setDescripcion("Este estadio es el mejor del mundo apodado EL TEMPLO.");

        //then
        assertNotNull(estadio);
        assertEquals("bombonera",estadio.getNombre());
        assertEquals(82300,estadio.getCapacidad());

    }
}
