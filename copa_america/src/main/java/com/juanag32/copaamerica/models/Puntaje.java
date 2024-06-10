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
    @Column(name = "partidos_jugados")
    private int partidosJugados;
    private int victoria;
    private int empate;
    private int derrota;
    @Column(name = "goles_favor")
    private int golesFavor;
    @Column(name = "goles_encontra")
    private int golesEncontra;
    @Column(name = "diferencia_gol")
    private int diferenciaGol;
}
