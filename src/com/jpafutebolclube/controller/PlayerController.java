package com.jpafutebolclube.controller;
import com.jpafutebolclube.dao.GenericDAO;
import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.util.Character;
/**
 *
 * @author itccolina
 */
public class PlayerController {
    private Jogador jogador;
    private GenericDAO<Jogador> jogadorDAO;
    
    public PlayerController() {
        jogador = new Jogador();
        jogadorDAO = new GenericDAO<>(Jogador.class);
    }
    
    public void salvar() {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.salvar(jogador);
    }
    
    public void salvar(String nome, String cpf, String posicao) {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        jogador.setNome(nome);
        jogador.setCpf(Character.CharacterRemove(cpf));
        jogador.setPosicao(posicao);
        jogadorDAO.salvar(jogador);
    }
    
    public void queryAll() {
        System.out.println("RESULTADO: " + jogadorDAO.findAll());
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
     
}
