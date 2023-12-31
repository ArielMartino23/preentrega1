package com.example.workshop.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "factura")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private ClienteModel cliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    private double total;

    // Getters and setters
}