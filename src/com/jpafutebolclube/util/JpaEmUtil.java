package com.jpafutebolclube.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leandro
 */
public class JpaEmUtil {
    private static final EntityManagerFactory emf;
    
    static {
        emf = Persistence.createEntityManagerFactory("JpaFutebolClubeV001PU");
    }
    
    public static EntityManager openConnection() {
        return emf.createEntityManager();
    }
    
    public static void closeConnection() {
        emf.close();
    }
}
