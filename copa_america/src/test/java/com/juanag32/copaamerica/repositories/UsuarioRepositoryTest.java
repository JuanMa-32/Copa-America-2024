package com.juanag32.copaamerica.repositories;

import com.juanag32.copaamerica.models.Usuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class UsuarioRepositoryTest {

    @Autowired
    UsuarioRepository repository;

    @Nested
    class testGet {
        @Test
        void testFindAll() {
            List<Usuario> usuarios = repository.findAll();
            assertFalse(usuarios.isEmpty());
        }

        @Test
        void testFindById() {
            Optional<Usuario> us = repository.findById(6L);

            assertTrue(us.isPresent());
            assertNotNull(us);
            assertEquals("password1",us.orElseThrow().getPassword());
        }

        @Test
        void testFindByEmail() {
            //given
            String email = "user1@example.com";

            //when
            Optional<Usuario> us = repository.findByEmail(email);

            //then
            assertTrue(us.isPresent());
            assertNotNull(us);
            assertEquals(email,us.orElseThrow().getEmail());

        }
    }

    @Nested
    class testDeGuardado {
        @Test
        void testGuardarUsuario() {
            //GIVEN
            Usuario us = new Usuario();
            us.setPassword("1445");
            us.setEmail("juanma@gmail.com");

            //when
            Usuario usuarioDb = repository.save(us);

            //then
            assertNotNull(usuarioDb.getId());
        }

    }


}
