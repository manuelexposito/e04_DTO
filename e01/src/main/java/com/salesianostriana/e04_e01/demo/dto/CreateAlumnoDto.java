package com.salesianostriana.e04_e01.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateAlumnoDto {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private Long cursoId;
    private Long direccionId;


}

