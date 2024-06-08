package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "grupos")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany
    @JoinColumn(name = "grupo_id")
    List<Seleccion> selecciones;

}
