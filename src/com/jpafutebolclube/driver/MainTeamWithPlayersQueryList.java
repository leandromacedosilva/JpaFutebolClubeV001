package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.TimeDAO;
import com.jpafutebolclube.model.Jogador;
import java.util.List;

/**
 *
 * @author itccolina
 */
public class MainTeamWithPlayersQueryList {
    public static void main(String[] args) {
        TimeDAO timeDAO = new TimeDAO();
        List<Jogador> jogadores = timeDAO.allPlayers();
        System.out.println("");
        System.out.println("############################################################ PLAYERS OF LIST ###################################################################");
        System.out.println("" + jogadores);
        System.out.println("################################################################################################################################################");
        System.out.println("");
    }
}
