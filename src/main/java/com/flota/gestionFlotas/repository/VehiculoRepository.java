package com.flota.gestionFlotas.repository;

import com.flota.gestionFlotas.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}