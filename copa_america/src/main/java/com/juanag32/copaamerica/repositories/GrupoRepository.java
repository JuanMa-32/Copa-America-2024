package com.juanag32.copaamerica.repositories;

import com.juanag32.copaamerica.models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GrupoRepository extends JpaRepository<Grupo,Long> {

   @Query("SELECT g FROM Grupo g JOIN FETCH g.selecciones s ORDER BY s.puntaje.puntos DESC")
   List<Grupo> findAllOrderBySeleccionesPuntajePuntos();
}
