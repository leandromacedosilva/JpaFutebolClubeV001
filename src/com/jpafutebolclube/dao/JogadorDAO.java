package com.jpafutebolclube.dao;

import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.util.JpaEmUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class JogadorDAO {
    public void salvar(Jogador jogador){
        EntityManager em  = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        em.persist(jogador);
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();
    }
    
    public void salvarList(List<Jogador> jogadores){
        EntityManager em  = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        for(Jogador j : jogadores) {
            em.persist(j);
        }
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();
    }
    
    public Jogador consultar(Long id) {
        EntityManager em = JpaEmUtil.openConnection();
        return em.find(Jogador.class, id);
        //JpaEmUtil.closeConnection();
    }
    
    public void atualizar(Jogador jogador){
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        em.merge(jogador);
        em.flush();
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();
    }
    
    public List<Jogador> allPlayers() {
        EntityManager em = JpaEmUtil.openConnection();
        String query = "SELECT j FROM Jogador j";
        return em.createQuery(query).getResultList();
    } 
}