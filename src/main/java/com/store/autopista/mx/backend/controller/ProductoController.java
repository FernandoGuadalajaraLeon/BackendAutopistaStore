package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.service.ProveedorService;
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

import com.store.autopista.mx.backend.dto.ProductoDto;
import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController extends CommonController<ProductoDto, Producto, ProductoService> {

	@GetMapping("/getByProveedor")
	public ResponseEntity<?> getByProveedor(@RequestParam Long id) {

		return new ResponseEntity<List<ProductoDto>>(service.getByProveedor(id), HttpStatus.OK);
	}
	
}
