package io.github.arieldossantos.studyapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "clientes")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

}
