package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NoticiaTest {

    @Test
    void testInstanciarNoticia() {
        //given
        Noticia noticia = new Noticia();

        noticia.setTitulo("Messi jugara su ultima copa America");
        noticia.setContenido("El jugador argentino jugara su ultima edicion en EEUU.");

        //then
        assertNotNull(noticia);
        assertEquals("Messi jugara su ultima copa America",noticia.getTitulo());
        assertEquals("El jugador argentino jugara su ultima edicion en EEUU.",noticia.getContenido());
    }
}
