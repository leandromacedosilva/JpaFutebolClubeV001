package com.jpafutebolclube.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbjogador")
@SequenceGenerator(name = "seq_tbjogador", sequenceName = "seq_tbjogador", initialValue = 1)
public class Jogador implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbjogador", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String posicao;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;
    
    public Jogador() {}

    public Jogador(Long id, String nome, String posicao, Time time) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public Jogador(String nome, String posicao, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }
    
    public void adicionarJogador() {}

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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", posicao=" + posicao + ", time=" + time + '}';
    }
    
}
