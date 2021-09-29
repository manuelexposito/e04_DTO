package com.salesianostriana.e04_e02.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetProductoDto {

    private String nombre;
    private double pvp;
    private String imagen;
    private String categoria;

}
