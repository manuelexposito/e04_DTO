package com.salesianostriana.e04_e02.demo.dto;


import com.salesianostriana.e04_e02.demo.pojo.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoDtoConverter {


    public Producto createProductoDtoToProducto(CreateProductoDto p){

        return new Producto(
                p.getNombre(),
                p.getDesc(),
                p.getPvp(),
                p.getImagenes()

        );

    }

    public GetProductoDto productoToGetProductoDto(Producto p){


        return GetProductoDto
                .builder()
                .nombre(p.getNombre())
                .pvp(p.getPvp())
                .imagenes(p.getImagenes())
                .categoria(p.getCategoria().getNombre())
                .build();



    }



}
