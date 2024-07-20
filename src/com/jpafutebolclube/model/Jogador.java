package com.jpafutebolclube.model;

import com.jpafutebolclube.generic.GenericEntity;
import com.jpafutebolclube.util.Message;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbjogador")
@SequenceGenerator(name = "seq_tbjogador", sequenceName = "seq_tbjogador", initialValue = 1, allocationSize = 1)
public class Jogador extends GenericEntity {
    @Id
    @GeneratedValue(generator = "seq_tbjogador", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String posicao;
      
    public Jogador() {}

    public Jogador(Long id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public void playerInformation() {
        System.out.println("CODIGO: " + this.id);
        System.out.println("NOME: " + this.nome);
        System.out.println("POSICAO: " + this.posicao);
    }

    public void adicionarJogador() {
        if(this.nome != null) {
            Message.message("Jogador adicionado com sucesso!");
        }
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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", posicao=" + posicao + '}';
    }
    
}
