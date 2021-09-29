package com.salesianostriana.e04_e02.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String desc;
    private double pvp;
    private Collection<String>imagenes;
    private String email;

    @ManyToOne
    Categoria categoria;



}
