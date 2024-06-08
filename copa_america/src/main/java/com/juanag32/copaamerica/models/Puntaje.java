package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "puntajes")
public class Puntaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int puntos;
    private int partidosJugados;
    private int victoria;
    private int empate;
    private int derrota;
    private int golesFavor;
    private int golesEncontra;
    private int diferenciaGol;
}
