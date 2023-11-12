package com.example.workshop.repository;

import com.example.workshop.model.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaModel, Integer> {
}
