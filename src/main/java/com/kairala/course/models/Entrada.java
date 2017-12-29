package com.kairala.course.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Entrada {
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private Double valor;
}
