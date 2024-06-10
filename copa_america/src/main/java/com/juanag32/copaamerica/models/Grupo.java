package com.juanag32.copaamerica.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "grupos")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "grupo_id")
    List<Seleccion> selecciones= new ArrayList<>();

    public void addSeleccion(Seleccion seleccion){
        this.selecciones.add(seleccion);
    }

}
