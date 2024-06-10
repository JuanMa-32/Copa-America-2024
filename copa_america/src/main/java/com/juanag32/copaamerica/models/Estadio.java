package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "estadios")
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;
    private Integer capacidad;
    private String descripcion;

}
