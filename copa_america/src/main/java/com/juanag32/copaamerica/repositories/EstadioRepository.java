package com.juanag32.copaamerica.repositories;

import com.juanag32.copaamerica.models.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EstadioRepository extends JpaRepository<Estadio,Long> {

    List<Estadio>findByLocalidadEstadoNombreContaining(String nombre);

    @Query("SELECT e FROM Estadio e " +
            "WHERE e.localidad.nombre LIKE %:localidadNombre% " +
            "AND e.localidad.estado.nombre LIKE %:estadoNombre%")
    List<Estadio> findByLocalidadAndEstado(
            @Param("localidadNombre") String localidadNombre,
            @Param("estadoNombre") String estadoNombre);
}
