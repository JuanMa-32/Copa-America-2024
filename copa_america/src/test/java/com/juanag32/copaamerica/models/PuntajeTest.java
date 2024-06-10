package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PuntajeTest {

    @Test
    void testInstanciarPuntaje() {
        //given
        Puntaje puntaje= new Puntaje();

        puntaje.setPuntos(3);
        puntaje.setPartidosJugados(2);
        puntaje.setVictoria(1);
        puntaje.setEmpate(0);
        puntaje.setDerrota(1);
        puntaje.setGolesFavor(3);
        puntaje.setGolesEncontra(3);
        puntaje.setDiferenciaGol(puntaje.getGolesFavor()-puntaje.getGolesEncontra());

        //then
        assertEquals(3,puntaje.getPuntos());
        assertEquals(1,puntaje.getVictoria());
        assertEquals(0,puntaje.getDiferenciaGol());


    }
}
