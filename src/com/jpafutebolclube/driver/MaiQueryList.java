package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;
import java.util.List;

/**
 *
 * @author leandro
 */
public class MaiQueryList {
    public static void main(String[] args) {
        JogadorDAO jogadorDAO = new JogadorDAO();
        List<Jogador> jogadores = jogadorDAO.allPlayers();
        System.out.println("");
        System.out.println("...............................................................");
        System.out.println("RESULTADO: " + jogadores);
        System.out.println("...............................................................");
        System.out.println("");
    }
}
