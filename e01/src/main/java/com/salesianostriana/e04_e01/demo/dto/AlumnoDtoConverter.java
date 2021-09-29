package com.salesianostriana.e04_e01.demo.dto;


import com.salesianostriana.e04_e01.demo.pojo.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto c) {
        return new Alumno(
                c.getNombre(),
                c.getApellido1(),
                c.getApellido2(),
                c.getEmail()


        );
    }

    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a) {


        GetAlumnoDto result = new GetAlumnoDto();
        result.setNombre(a.getNombre());
        result.setApellidos(String.format("%s %s",a.getApellido1(),a.getApellido2()));
        result.setEmail(a.getEmail());
        result.setDireccion(a.getDireccion().getTipoVia());
        result.setCurso(a.getCurso().getNombre());
        return result;


    }
}
