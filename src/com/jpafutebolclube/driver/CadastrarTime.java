package com.jpafutebolclube.driver;

import com.jpafutebolclube.model.Time;
import com.jpafutebolclube.util.JpaEmUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class CadastrarTime {
    public static void main(String[] args) {
        EntityManager em = JpaEmUtil.openConnection();
        em.getTransaction().begin();
        
        Time time001 = new Time();
        time001.setNome("Vitoria FC");
        
        Time time002 = new Time();
        time002.setNome("Sao Paulo FC");
        
        Time time003 = new Time();
        time003.setNome("Bota Fogo FC");
        
        Time time004 = new Time();
        time004.setNome("Internacional FC");
        
        Time time005 = new Time();
        time005.setNome("Barueri FC");
        
        List<Time> times = new ArrayList<>();
        times.add(time001);
        times.add(time002);
        times.add(time003);
        times.add(time004);
        times.add(time005);
        
        for(Time t : times) {
            em.persist(t);
        }
        
        em.getTransaction().commit();
        JpaEmUtil.closeConnection();
    }
}
