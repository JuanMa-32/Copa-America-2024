package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstadoTest {

    @Test
    void testInstanciarEstado() {
        //given
        Estado estado = new Estado();

        estado.setNombre("Florida");

        //then
        assertEquals("Florida",estado.getNombre());
    }
}
