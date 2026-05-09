package com.flota.gestionFlotas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String marca;
    private String modelo;
    private int kmActuales;

    //Constructor vacío 
    public Vehiculo() {}

    //Constructor completo
    public Vehiculo(String matricula, String marca, String modelo, int kmActuales) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kmActuales = kmActuales;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getKmActuales() {
        return kmActuales;
    }
    public void setKmActuales(int kmActuales) {
        this.kmActuales = kmActuales;
    }
}