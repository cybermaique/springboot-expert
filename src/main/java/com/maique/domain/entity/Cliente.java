package com.maique.domain.entity;

import javax.persistence.*;

@Entity //entidade jpa
@Table (name = "cliente")//só é obrigatório colocar essa annotation se o nome da tabela for diferente da classe
public class Cliente {

    @Id //define primarykey
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id") //da pra definir o nome da coluna no db
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    public Cliente() {
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
