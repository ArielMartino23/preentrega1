package com.example.workshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoModel {
    /*private Object GenerationType;*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String descripcion;
    private String codigo;
    private int stock;
    private double price;

    // Getters and setters
}
