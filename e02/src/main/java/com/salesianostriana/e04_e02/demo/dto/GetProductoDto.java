package com.salesianostriana.e04_e02.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetProductoDto {

    private String nombre;
    private double pvp;
    @ElementCollection
    private Collection<String> imagenes;
    private String categoria;

}
