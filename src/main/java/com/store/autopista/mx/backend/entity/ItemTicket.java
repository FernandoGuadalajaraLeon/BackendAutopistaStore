package com.store.autopista.mx.backend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class ItemTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItemProducto;

    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Producto producto;

    public Double getPrecioTotal(){
        return Double.valueOf(this.cantidad) * this.producto.getPrecioVenta();
    }

    private static final long serialVersionUID = 1L;

}
