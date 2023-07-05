package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Tienda;

public record TiendaDto (Long idTienda, String nombre, String ubicacion){

    public TiendaDto(Tienda tienda){
        this(tienda.getIdTienda(), tienda.getNombre(), tienda.getUbicacion());
    }

}
