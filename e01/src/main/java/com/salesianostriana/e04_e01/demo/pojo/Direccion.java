package com.salesianostriana.e04_e01.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Direccion {


    @Id
    @GeneratedValue
    private Long id;

    private String tipoVia;
    private String linea1;
    private String linea2;
    private String cp;
    private String poblacion;
    private String provincia;


    public Direccion(String tipoVia, String linea1, String linea2, String cp, String poblacion, String provincia) {
        this.tipoVia = tipoVia;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }
}
