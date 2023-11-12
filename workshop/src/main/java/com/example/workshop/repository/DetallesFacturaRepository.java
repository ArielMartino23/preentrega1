package com.example.workshop.repository;

import com.example.workshop.model.DetallesFacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallesFacturaRepository extends JpaRepository<DetallesFacturaModel, Integer> {
}
