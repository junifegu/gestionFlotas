package com.flota.gestionFlotas.repository;

import com.flota.gestionFlotas.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
}