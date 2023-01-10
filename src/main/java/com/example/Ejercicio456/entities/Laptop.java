package com.example.Ejercicio456.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String marca;

    private String color;

    private Integer memoria;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String color,Integer memoria) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.memoria = memoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }
}
