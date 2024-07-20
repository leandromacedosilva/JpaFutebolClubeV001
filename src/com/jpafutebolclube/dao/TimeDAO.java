package com.jpafutebolclube.dao;

import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.model.Time;
import com.jpafutebolclube.util.JpaEmUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class TimeDAO {
    public void salvar(Time time){   
        try{
            System.out.println("PERSISTINDO DADOS NO BANCO DE DADOS.");
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        em.persist(time);
        em.getTransaction().commit();
        } finally {
            JpaEmUtil.closeConnection();
            System.out.println("A CONEXAO COM O BANCO DE DADO FOI ENCERRADA.");
        }
     }
    
    public Jogador consultar(Long id) {
        EntityManager em = JpaEmUtil.openConnection();
        return em.find(Jogador.class, id);
    }
    
    public void atualizar(Jogador jogador) {
        try{
            System.out.println("PERSISTINDO DADOS NO BANCO DE DADOS.");
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        em.merge(jogador);
        em.flush();
        em.getTransaction().commit();
        } finally {
            JpaEmUtil.closeConnection();
            System.out.println("A CONEXAO COM O BANCO DE DADO FOI ENCERRADA.");
        }
    }
    
    public List<Time> allTeams() {
        try {
            System.out.println("PERSISTINDO DADOS NO BANCO DE DADOS.");
        EntityManager em = JpaEmUtil.openConnection();
        String query = "SELECT t FROM Time t";
        return em.createQuery(query).getResultList();
        } finally {
            JpaEmUtil.closeConnection();
            System.out.println("A CONEXAO COM O BANCO DE DADO FOI ENCERRADA.");
        }
    }
    
    public List<Jogador> allPlayers() {
        try {
            System.out.println("PERSISTINDO DADOS NO BANCO DE DADOS.");
        EntityManager em = JpaEmUtil.openConnection();
        String query = "SELECT j FROM Jogador j";
        return em.createQuery(query).getResultList();
        } finally {
            JpaEmUtil.closeConnection();
            System.out.println("A CONEXAO COM O BANCO DE DADO FOI ENCERRADA.");
        }
    }
}
