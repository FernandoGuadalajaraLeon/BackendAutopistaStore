package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CommonController<D, E, S extends CommonService<D, E>> {
	
	@Autowired
	S service;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody E entity) {
		
		return new ResponseEntity<D>(service.save(entity), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody E entity) {
		
		return new ResponseEntity<D>(service.update(entity), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody E entity) {
		try {
			service.delete(entity);
			return new ResponseEntity<String>("Elemento borrado de manera exitosa", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error al eliminar elemento", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> get(@RequestParam Long id) {

		return new ResponseEntity<D>(service.get(id), HttpStatus.OK);
	}
	
}
