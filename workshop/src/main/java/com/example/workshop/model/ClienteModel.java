package com.example.workshop.model;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    // Getters and setters
}
