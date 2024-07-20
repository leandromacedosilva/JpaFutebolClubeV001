package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;

/**
 *
 * @author leandro
 */
public class MainPlayerQueryForName {
    public static void main(String[] args) {
        JogadorDAO jogadorDAO = new JogadorDAO();
        JogadorDAO j = (JogadorDAO) jogadorDAO.allPlayersForName();
        System.out.println("" + j);
    }
}
