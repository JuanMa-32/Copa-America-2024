package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "noticias")
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;
    //private Imagen imagen;
}
