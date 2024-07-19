package com.jpafutebolclube.driver;

import com.jpafutebolclube.util.JpaEmUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class MainQueryForName {
    public static void main(String[] args) {
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();
    }
}
