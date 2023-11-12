package com.example.workshop.repository;

import com.example.workshop.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,Integer> {
}
