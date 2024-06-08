package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "selecciones")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apodo;
    private String debut;
    private Integer participaciones;
    private Integer titulos;
    @OneToOne
    @JoinColumn(name = "puntaje_id")
    private Puntaje puntaje;

}
