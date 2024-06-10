package com.juanag32.copaamerica.repositories;

import com.juanag32.copaamerica.models.Estadio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class EstadioTest {

    @Autowired
    EstadioRepository repository;

    @Nested
    class testsRead{
        @Test
        void testFindByEstado() {
            //given
            String estado= "Nevada";

            //when
            List<Estadio> estadiosPorUbicacion = repository.findByLocalidadEstadoNombreContaining(estado);

            //then
            assertFalse(estadiosPorUbicacion.isEmpty());
            assertEquals(estado,estadiosPorUbicacion.get(0).getLocalidad().getEstado().getNombre());
        }

        @Test
        void testFindByLocalidadAndEstado() {
            //given
            String estado = "California";
            String localidad = "Los Angeles";
            //when
            List<Estadio> estadios = repository.findByLocalidadAndEstado(localidad,estado);
            //then
            assertFalse(estadios.isEmpty());

        }
        @Test
        void findById() {
            //given
            String nombreEstadio= "Estadio Azteca";
            //when
            Optional<Estadio> o = repository.findById(7L);
            //then
           assertNotNull(o);
           assertTrue(o.isPresent());
           assertEquals(nombreEstadio,o.orElseThrow().getNombre());
           assertNotNull(o.orElseThrow().getLocalidad());
           assertEquals("Los Angeles",o.orElseThrow().getLocalidad().getNombre());
        }

        @Test
        void findAll() {
            //when
            List<Estadio> estadios = repository.findAll();

            //then
            assertFalse(estadios.isEmpty());

        }


    }

    @Nested
    class testsSave{

        @Test
        void testCrearEstadio() {
            //giveen
            Estadio estadio = new Estadio();
            estadio.setCapacidad(89600);
            estadio.setNombre("Bombonera");
            estadio.setDescripcion("es el mejor estadio del mundo.");

            //when
            Estadio estadioDb = repository.save(estadio);

            //then
            assertNotNull(estadioDb);
            assertEquals("Bombonera",estadioDb.getNombre());
            assertEquals(89600,estadioDb.getCapacidad());
        }
    }
}
