package com.juanag32.copaamerica.models;

import com.juanag32.copaamerica.enums.Fase;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Seleccion local;

    @ManyToOne
    @JoinColumn(name = "visitante_id")
    private Seleccion visitante;

    @ManyToOne
    @JoinColumn(name = "estadio_id")
    private Estadio estadio;

    @Enumerated(EnumType.STRING)
    private Fase fase;

    private LocalDateTime diaPartido;
}
