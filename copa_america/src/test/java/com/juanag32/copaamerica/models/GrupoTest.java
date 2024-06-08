package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GrupoTest {

    @Test
    void testCrearGrupo() {
        //given
        Seleccion arg = new Seleccion(1L,"argentina","albiceleste","1966",50,18,null);
        Seleccion can = new Seleccion(2L,"canada","aaaa","1955",55,0,null);
        Seleccion per = new Seleccion(3L,"peru","albiceleste","1999",15,1,null);
        Seleccion chi = new Seleccion(4L,"chile","la roja","1956",33,2,null);

        List<Seleccion>selecciones = Arrays.asList(arg,can,per,chi);

        Grupo grupo = new Grupo();
        grupo.setNombre("A");
        grupo.setSelecciones(selecciones);

        //then
        assertEquals(4,grupo.getSelecciones().size());
        assertTrue(grupo.getSelecciones().size()>3);
        assertEquals("A",grupo.getNombre());

    }
}
