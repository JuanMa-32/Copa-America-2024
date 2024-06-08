package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "localidades")
public class Localidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
}
