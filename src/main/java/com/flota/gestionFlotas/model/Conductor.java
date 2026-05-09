package com.flota.gestionFlotas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "conductores")
public class Conductor {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String numeroLicencia;
    private LocalDate fechaNacimiento;

    //Constructor vacío
    public Conductor() {}

    //Constructor lleno
    public Conductor(String nombre, String apellidos, String numeroLicencia, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroLicencia = numeroLicencia;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNumeroLicencia() {
        return numeroLicencia;
    }
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}