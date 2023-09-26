package com.br.fiap.idwall.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_PROCURADOS")
public class Procurados {

    @Id
    @Column(name = "id", columnDefinition = "CLOB")
    private String id;

    @Column(name = "nome", columnDefinition = "CLOB")
    private String nome;

    @Column(name = "url", columnDefinition = "CLOB")
    private String url;




}
