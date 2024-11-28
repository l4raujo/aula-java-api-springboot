package com.equipe1.sistema_escolar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sala")

public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_sala")
    private Long Id;

    @Column(name = "nome_sala")
    private String nome;


    @Column(name = "capacidade")
    private int capacidade;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
