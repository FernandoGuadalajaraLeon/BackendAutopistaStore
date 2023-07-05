package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Proveedor;

public record ProveedorDto (Long idProveedor, String nombre, int diaVisita){

    public ProveedorDto(Proveedor prov){
        this(prov.getIdProveedor(), prov.getNombre(), prov.getDiaVisita());
    }


}
