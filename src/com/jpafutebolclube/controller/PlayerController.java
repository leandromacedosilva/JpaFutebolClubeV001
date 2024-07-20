package com.jpafutebolclube.controller;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;

/**
 *
 * @author itccolina
 */
public class PlayerController {
    private Jogador jogador;
    
    public PlayerController() {
        jogador = new Jogador();
    }
    
    public void salvar() {
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.salvar(jogador);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
     
}
