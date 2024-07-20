package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;

/**
 *
 * @author leandro
 */
public class MainPlayerQueryUpdate {
    public static void main(String[] args) {
        
        JogadorDAO jogadorDAO = new JogadorDAO();
        Jogador j = jogadorDAO.consultar(12L);
        j.setNome("Manoel");
        jogadorDAO.atualizar(j);
        System.out.println("");
        System.out.println("......................................................");
        System.out.println("NOME: " + j.getNome() + " POSICAO: " + j.getPosicao());
        System.out.println("......................................................");
        System.out.println("");
 
    }
}
