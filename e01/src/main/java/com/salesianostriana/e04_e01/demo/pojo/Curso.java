package com.salesianostriana.e04_e01.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;




}
