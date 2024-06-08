package com.juanag32.copaamerica.models;

import static org.junit.jupiter.api.Assertions.*;

import com.juanag32.copaamerica.enums.Role;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    void testCrearUsuario() {
        //given
        Usuario usuario = new Usuario();

        usuario.setEmail("juanmaguero4@gmail.com");
        usuario.setPassword("copaAmerica2024");
        usuario.setRol(Role.ADMIN);

        //then
        assertNotNull(usuario);
        assertEquals("juanmaguero4@gmail.com",usuario.getEmail());
        assertEquals("copaAmerica2024",usuario.getPassword());
        assertEquals("ADMIN",usuario.getRol().toString());

    }
}
