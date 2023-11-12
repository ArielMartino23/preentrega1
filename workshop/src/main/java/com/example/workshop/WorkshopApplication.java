package com.example.workshop;

import com.example.workshop.repository.ClienteRepository;
import com.example.workshop.repository.DetallesFacturaRepository;
import com.example.workshop.repository.FacturaRepository;
import com.example.workshop.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopApplication implements CommandLineRunner {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	DetallesFacturaRepository detallesFacturaRepository;

	@Autowired
	FacturaRepository facturaRepository;

	@Autowired
	ProductoRepository productoRepository;
	public static void main(String[] args) {
		SpringApplication.run(WorkshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
