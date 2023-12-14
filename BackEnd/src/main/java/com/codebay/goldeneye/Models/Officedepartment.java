package com.codebay.goldeneye.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

// TABLE OF DEPARTMENTS 

@Entity
public class Officedepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "ciudad_id")
    private City city;

    
    // GETTERS AND SETTERS
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

