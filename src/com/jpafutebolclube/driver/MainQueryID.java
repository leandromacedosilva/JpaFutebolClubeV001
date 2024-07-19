package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;
import com.jpafutebolclube.util.JpaEmUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class MainQueryID {
    public static void main(String[] args) {
     JogadorDAO jogadorDAO = new JogadorDAO();
     Jogador j = jogadorDAO.consultar(12L);
        System.out.println("");
        System.out.println("..........................................................");
        System.out.println("RESULTADO: " + j);
        System.out.println("..........................................................");
        System.out.println("");
    }
}
