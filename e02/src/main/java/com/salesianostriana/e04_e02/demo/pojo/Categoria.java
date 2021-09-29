package com.salesianostriana.e04_e02.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
