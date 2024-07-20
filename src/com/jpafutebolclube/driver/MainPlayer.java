package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
public class MainPlayer {
    public static void main(String[] args) {
        Jogador jogador001 = new Jogador();
        jogador001.setNome("Romulo");
        jogador001.setPosicao("Atacante");
        
        Jogador jogador002 = new Jogador();
        jogador002.setNome("Carlos");
        jogador002.setPosicao("Zagueiro");
        
        Jogador jogador003 = new Jogador();
        jogador003.setNome("Fabio");
        jogador003.setPosicao("Lateral");
        
        Jogador jogador004 = new Jogador();
        jogador004.setNome("Tulio");
        jogador004.setPosicao("Goleiro");
        
        Jogador jogador005 = new Jogador();
        jogador005.setNome("Igor");
        jogador005.setPosicao("Meio de campo");
        
        Jogador jogador006 = new Jogador();
        jogador006.setNome("Dorival");
        jogador006.setPosicao("Atacante");
        
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador001);
        jogadores.add(jogador002);
        jogadores.add(jogador003);
        jogadores.add(jogador004);
        jogadores.add(jogador005);
        jogadores.add(jogador006);
        
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.salvarList(jogadores);
    }
}
