package com.jpafutebolclube.dao;

import com.jpafutebolclube.model.Time;
import com.jpafutebolclube.util.JpaEmUtil;
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
}
