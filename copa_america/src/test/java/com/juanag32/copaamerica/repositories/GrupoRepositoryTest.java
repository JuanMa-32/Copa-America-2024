package com.juanag32.copaamerica.repositories;

import com.juanag32.copaamerica.models.Grupo;
import com.juanag32.copaamerica.models.Seleccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class GrupoRepositoryTest {

    @Autowired
    GrupoRepository repository;

    @Nested
    class testRead {

        @Test
        void testGrupoOrdenadoPorPuntos() {
            //when
            List<Grupo> gruposOrdenados = repository.findAllOrderBySeleccionesPuntajePuntos();
            //then
            assertFalse(gruposOrdenados.isEmpty());
            assertEquals("Argentina",gruposOrdenados.get(0).getSelecciones().get(0).getNombre());

        }

        @Test
        void testFindById() {
            //when
            Optional<Grupo> o = repository.findById(6L);
            //then
            assertEquals("A",o.orElseThrow().getNombre());
        }

        @Test
        void testFindAll() {
            //when
            List<Grupo> grupos = repository.findAll();
            //then
            assertFalse(grupos.isEmpty());
            assertTrue(grupos.size()>=2);
        }
    }

    @Nested
    class testGuardado {
        @Test
        void testCrearGrupo() {
            //given
            Grupo grupo = null;
            grupo = new Grupo();
            Seleccion mex = new Seleccion();
            mex.setNombre("Mexico");
            grupo.setNombre("C");
            grupo.setSelecciones(Arrays.asList(mex));

            //when
            grupo = repository.save(grupo);

            //then
            assertNotNull(grupo.getId());
            assertNotNull(grupo);
            assertFalse(grupo.getSelecciones().isEmpty());
            assertEquals("C", grupo.getNombre());
        }
    }
}
