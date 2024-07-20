package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.TimeDAO;
import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.model.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itccolina
 */
public class MainTeamPersist {
    public static void main(String[] args) {
        
        // DADOS DOS JOGADORES TIME001 
        Jogador jogador001 = new Jogador();
        jogador001.setNome("Bicudo");
        jogador001.setPosicao("Zagueiro");
        
        Jogador jogador002 = new Jogador();
        jogador002.setNome("Cascao");
        jogador002.setPosicao("Lateral direito");
        
        Jogador jogador003 = new Jogador();
        jogador003.setNome("Lasanha");
        jogador003.setPosicao("Meio de campo");
        
        Jogador jogador004 = new Jogador();
        jogador004.setNome("Sardinha");
        jogador004.setPosicao("Meio de campo");
        
        Jogador jogador005 = new Jogador();
        jogador005.setNome("Peru");
        jogador005.setPosicao("Meia esquerdo");
        
        Jogador jogador006 = new Jogador();
        jogador006.setNome("Meia Sola");
        jogador006.setPosicao("Atacante");
        
        Jogador jogador007 = new Jogador();
        jogador007.setNome("Palito");
        jogador007.setPosicao("Lateral direito");
        
        Jogador jogador008 = new Jogador();
        jogador008.setNome("Mortadela");
        jogador008.setPosicao("Atacante");
        
        Jogador jogador009 = new Jogador();
        jogador009.setNome("Toscana");
        jogador009.setPosicao("Armador");
        
        Jogador jogador010 = new Jogador();
        jogador010.setNome("Berinjela");
        jogador010.setPosicao("Meio de campo");
        
        Jogador jogador011 = new Jogador();
        jogador011.setNome("Sofa");
        jogador011.setPosicao("Lateral esquerdo");
        
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador001);
        jogadores.add(jogador002);
        jogadores.add(jogador003);
        jogadores.add(jogador004);
        jogadores.add(jogador005);
        jogadores.add(jogador006);
        jogadores.add(jogador007);
        jogadores.add(jogador008);
        jogadores.add(jogador009);
        jogadores.add(jogador010);
        jogadores.add(jogador011);
        
//        JogadorDAO jogadorDAO = new JogadorDAO();
//        jogadorDAO.salvarList(jogadores);
        
        // DADOS TIME001 
        Time time001 = new Time();
        time001.setNome("Curitiba");
        time001.setJogadores(jogadores);
//        Time time002 = new Time();
//        Time time003 = new Time();
//        Time time004 = new Time();
//        Time time005 = new Time();
//        Time time006 = new Time();
        
        TimeDAO timeDAO = new TimeDAO();
        timeDAO.salvar(time001);
    }
}
