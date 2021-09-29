package com.salesianostriana.e04_e02.demo.dto;


import org.springframework.stereotype.Component;

@Component
public class ProductoDtoConverter {


    public Producto createProductoDtoToProducto(CreateProductoDto p){

        return new Producto(
                p.getCategoriaId(),
                p.getDesc(),
                p.getNombre(),
                p.getImagenes(),
                p.getCategoriaId()


        );


    }



}
