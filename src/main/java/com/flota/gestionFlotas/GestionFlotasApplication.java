package com.flota.gestionFlotas;

import com.flota.gestionFlotas.model.Conductor;
import com.flota.gestionFlotas.model.Vehiculo;
import com.flota.gestionFlotas.repository.ConductorRepository;
import com.flota.gestionFlotas.repository.VehiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class GestionFlotasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionFlotasApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(VehiculoRepository vehiculoRepo, ConductorRepository conductorRepo) {
        return args -> {
            if (vehiculoRepo.count() == 0) {
                vehiculoRepo.save(new Vehiculo("1234ABC", "Toyota", "Corolla", 45000));
                vehiculoRepo.save(new Vehiculo("5678DEF", "Ford", "Focus", 32000));
                vehiculoRepo.save(new Vehiculo("9012GHI", "Seat", "Ibiza", 78000));
                vehiculoRepo.save(new Vehiculo("3456JKL", "Renault", "Megane", 21000));
                vehiculoRepo.save(new Vehiculo("7890MNO", "Volkswagen", "Golf", 55000));
                vehiculoRepo.save(new Vehiculo("2345PQR", "BMW", "Serie 3", 12000));
                vehiculoRepo.save(new Vehiculo("6789STU", "Mercedes", "Clase A", 67000));
                vehiculoRepo.save(new Vehiculo("0123VWX", "Audi", "A4", 43000));
                vehiculoRepo.save(new Vehiculo("4567YZA", "Peugeot", "308", 29000));
                vehiculoRepo.save(new Vehiculo("8901BCD", "Opel", "Astra", 91000));
            }

            if (conductorRepo.count() == 0) {
                conductorRepo.save(new Conductor("Juan", "García López", "B-12345", LocalDate.of(1985, 3, 15)));
                conductorRepo.save(new Conductor("María", "Martínez Ruiz", "B-23456", LocalDate.of(1990, 7, 22)));
                conductorRepo.save(new Conductor("Carlos", "Sánchez Pérez", "C-34567", LocalDate.of(1978, 11, 8)));
                conductorRepo.save(new Conductor("Ana", "López Fernández", "B-45678", LocalDate.of(1995, 1, 30)));
                conductorRepo.save(new Conductor("Pedro", "González Díaz", "D-56789", LocalDate.of(1982, 6, 14)));
                conductorRepo.save(new Conductor("Laura", "Rodríguez Gil", "B-67890", LocalDate.of(1993, 9, 25)));
                conductorRepo.save(new Conductor("Miguel", "Hernández Mora", "C-78901", LocalDate.of(1975, 4, 3)));
                conductorRepo.save(new Conductor("Elena", "Torres Vega", "B-89012", LocalDate.of(1988, 12, 17)));
                conductorRepo.save(new Conductor("David", "Ramírez Cruz", "B-90123", LocalDate.of(1997, 2, 9)));
                conductorRepo.save(new Conductor("Sara", "Flores Medina", "C-01234", LocalDate.of(1980, 8, 21)));
            }
        };
    }
}