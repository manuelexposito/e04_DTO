package com.salesianostriana.e04_e02.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductoDto {

    private String nombre;
    private String desc;
    private double pvp;

    @ElementCollection
    private Collection<String> imagenes;

    private Long categoriaId;


}
