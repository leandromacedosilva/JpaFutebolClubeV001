package com.jpafutebolclube.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbtime")
@SequenceGenerator(name = "seq_tbtime", sequenceName = "seq_tbtime", initialValue = 1)
public class Time implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbtime", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    @OneToMany
    private List<Jogador> jogadores;
    
    public Time() {}

    public Time(Long id, String nome, List<Jogador> jogadores) {
        this.id = id;
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "Time{" + "id=" + id + ", nome=" + nome + ", jogadores=" + jogadores + '}';
    }
    
    
}
