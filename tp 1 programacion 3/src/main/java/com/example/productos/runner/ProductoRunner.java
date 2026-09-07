package com.example.productos.runner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.productos.model.Producto;
import com.example.productos.repository.ProductoRepository;

@Component
public class ProductoRunner implements CommandLineRunner {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public void run(String... args) throws Exception {

		Producto teclado = new Producto("Teclado mecanico", "Perifericos", new BigDecimal("25000"), 15);
		Producto mouse = new Producto("Mouse inalambrico", "Perifericos", new BigDecimal("8000"), 30);
		Producto monitor = new Producto("Monitor 24 pulgadas", "Pantallas", new BigDecimal("120000"), 5);
		Producto auriculares = new Producto("Auriculares", "Audio", new BigDecimal("15000"), 20);

		productoRepository.save(teclado);
		productoRepository.save(mouse);
		productoRepository.save(monitor);
		productoRepository.save(auriculares);

		System.out.println("== Listado ordenado por precio ==");
		List<Producto> productos = productoRepository.findAllByOrderByPrecioAsc();
		for (Producto p : productos) {
			System.out.println(p);
		}

		Optional<Producto> buscado = productoRepository.findById(monitor.getId());
		if (buscado.isPresent()) {
			Producto p = buscado.get();
			System.out.println("== Modificando precio de: " + p.getNombre() + " ==");
			p.setPrecio(new BigDecimal("99999"));
			productoRepository.save(p);
		}

		System.out.println("== Eliminando el monitor ==");
		productoRepository.deleteById(monitor.getId());

		System.out.println("== Listado final ==");
		for (Producto p : productoRepository.findAllByOrderByPrecioAsc()) {
			System.out.println(p);
		}
	}
}
