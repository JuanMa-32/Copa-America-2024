package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SeleccionTest {

    @Test
    void testCrearSeleccion() {

        //given
        Seleccion seleccion = new Seleccion();
        seleccion.setNombre("Argentina");
        seleccion.setApodo("Albiceleste");
        seleccion.setDebut("1968");
        seleccion.setParticipaciones(55);
        seleccion.setTitulos(18);

        Puntaje puntaje = new Puntaje();
        puntaje.setPuntos(6);
        seleccion.setPuntaje(puntaje);

        //then
        assertEquals("Argentina",seleccion.getNombre());
        assertEquals(18,seleccion.getTitulos());
        assertEquals(6,seleccion.getPuntaje().getPuntos());

    }
}
