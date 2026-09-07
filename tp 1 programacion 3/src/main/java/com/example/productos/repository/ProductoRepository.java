package com.example.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	// listado ordenado, de mas barato a mas caro
	List<Producto> findAllByOrderByPrecioAsc();

}
