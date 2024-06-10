package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LocalidadTest {

    @Test
    void testInstanciarLocalidad() {
        //given
        Localidad localidad = new Localidad();

        localidad.setNombre("Miami");
        localidad.setEstado(new Estado(1L,"Florida"));

        //then
        assertEquals("Miami",localidad.getNombre());
        assertNotNull(localidad.getEstado());
        assertEquals("Florida",localidad.getEstado().getNombre());
    }
}
