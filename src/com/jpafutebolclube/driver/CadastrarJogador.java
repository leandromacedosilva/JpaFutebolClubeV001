package com.jpafutebolclube.driver;

import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.model.Time;
import com.jpafutebolclube.util.JpaEmUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class CadastrarJogador {
    public static void main(String[] args) {
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        
        Jogador jogador001 = new Jogador();
        jogador001.setNome("Manoel");
        jogador001.setPosicao("Zagueiro");
        
        Jogador jogador002 = new Jogador();
        jogador002.setNome("Antonio");
        jogador002.setPosicao("Lateral");
        
        Jogador jogador003 = new Jogador();
        jogador003.setNome("Pedro");
        jogador003.setPosicao("Goleiro");
        
        Jogador jogador004 = new Jogador();
        jogador004.setNome("Joel");
        jogador004.setPosicao("Meio de campo");
        
        Jogador jogador005 = new Jogador();
        jogador005.setNome("Tomas");
        jogador005.setPosicao("Atacante");
        
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador001);
        jogadores.add(jogador002);
        jogadores.add(jogador003);
        jogadores.add(jogador004);
        jogadores.add(jogador005);
        
        for(Jogador j : jogadores){
            em.persist(j);
        }
        
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();    }
}
