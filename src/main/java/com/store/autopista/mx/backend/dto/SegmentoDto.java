package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Segmento;

public record SegmentoDto (Long idSegmento, String nombre, String descripcion){

    public SegmentoDto(Segmento segmento){
        this(segmento.getIdSegmento(), segmento.getNombre(), segmento.getDescripcion());
    }

}
