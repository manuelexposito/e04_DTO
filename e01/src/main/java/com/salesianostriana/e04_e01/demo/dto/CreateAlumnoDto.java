package com.salesianostriana.e04_e01.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateAlumnoDto {

    private String nombre;
    private String apellidos;
    private String email;
    private Long cursoId;
    private Long direccionId;


}

