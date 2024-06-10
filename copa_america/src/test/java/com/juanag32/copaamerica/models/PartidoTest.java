package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;

import com.juanag32.copaamerica.enums.Fase;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class PartidoTest {

    @Test
    void testInstanciarPartido() {
        //given
        Partido partido = new Partido();
        Seleccion local =new Seleccion();
        Seleccion visitante = new Seleccion();
        local.setNombre("Argentina");
        visitante.setNombre("Canada");

        partido.setLocal(local);
        partido.setVisitante(visitante);
        partido.setEstadio(new Estadio());
        partido.setFase(Fase.GRUPOS);
        partido.setDiaPartido(LocalDateTime.now());

        //then
        assertEquals("Argentina",local.getNombre());
        assertEquals("Canada",visitante.getNombre());
        assertNotNull(partido.getEstadio());
        assertEquals("GRUPOS",partido.getFase().toString());
        assertEquals(LocalDateTime.now().getDayOfMonth(),partido.getDiaPartido().getDayOfMonth());

    }
}
