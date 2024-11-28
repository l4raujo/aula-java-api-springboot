package com.equipe1.sistema_escolar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")

public class Presenca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_presenca")
    private Date dataPresenca;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(Date dataPresenca) {
        this.dataPresenca = dataPresenca;
    }
}

