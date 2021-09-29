package com.salesianostriana.e04_e01.demo.dto;





public class AlumnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto c) {
        return new Alumno(
                c.getNombre(),
                c.getApellidos(),
                c.getEmail(),
                c.getCurso(),
                c.getDireccion()

        );
    }

    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a) {


        GetAlumnoDto result = new GetAlumnoDto();
        result.setNombre(a.getNombre());
        result.setApellidos(a.getApellidos());
        result.setEmail(a.getEmail());
        result.setDireccion(a.getDireccion);
        result.setCurso(a.getCurso().getNombre());
        return result;


    }
