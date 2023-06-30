package com.store.autopista.mx.backent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.autopista.mx.backent.Dto.ProductoDto;
import com.store.autopista.mx.backent.Entity.Producto;
import com.store.autopista.mx.backent.Service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/hola")
	public String hola() {
		System.out.println("Hola en consola");
		return "Hola desde controller";
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Producto producto) {
		
		return new ResponseEntity<ProductoDto>(productoService.save(producto), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Producto producto) {
		
		return new ResponseEntity<ProductoDto>(productoService.update(producto), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody Producto producto) {
		try {
			productoService.delete(producto);
			return new ResponseEntity<String>("Elemento borrado de manera exitosa", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error al eliminar elemento", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/get/")
	public ResponseEntity<?> get(@RequestParam Long id) {

		return new ResponseEntity<ProductoDto>(productoService.get(id), HttpStatus.OK);
	}
	
	@GetMapping("/getByProveedor")
	public ResponseEntity<?> getByProveedor(@RequestParam Long id) {

		return new ResponseEntity<ProductoDto>(productoService.getByProveedor(id), HttpStatus.OK);
	}
	
}
