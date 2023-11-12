package com.example.workshop.model;
import jakarta.persistence.*;

@Entity
@Table(name = "detalles_factura")
public class DetallesFacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "factura_id", nullable = false)
    private FacturaModel factura;

    @ManyToOne
    @JoinColumn(name = "productos_id", nullable = false)
    private ProductoModel producto;

    @Column(name = "cantidad_productos")
    private int cantidadProductos;

    private double importe;

    // Getters and setters
}