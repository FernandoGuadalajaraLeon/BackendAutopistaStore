package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.ProductoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController extends CommonController<ProductoDto, Producto, ProductoService> {


	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {

		return new ResponseEntity<List<ProductoDto>>(service.getAll(), HttpStatus.OK);
	}

	@GetMapping("/getByProveedor")
	public ResponseEntity<?> getByProveedor(@RequestParam Long id) {

		return new ResponseEntity<List<ProductoDto>>(service.getByProveedor(id), HttpStatus.OK);
	}
	
}
