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
        
        //Jogador jogador001 = new Jogador("Adao", "Meio de campo", jogador001.setTime(time));
        //jogador001.setNome("Manoel");
        //jogador001.setPosicao("Zagueiro");
        
        Jogador jogador002 = new Jogador();
        //jogador001.setNome("Rodolfo");
        //jogador001.setPosicao("Lateral");
        
        List<Jogador> jogadores = new ArrayList<>();
        //jogadores.add(jogador001);
        jogadores.add(jogador002);
        
        //em.persist(jogadores);
        
        Time time = new Time();
        time.setNome("Aguia");
        time.setJogadores(jogadores);
        
        //jogador001.setTime(time);
        
        em.persist(time);
        
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();    }
}
