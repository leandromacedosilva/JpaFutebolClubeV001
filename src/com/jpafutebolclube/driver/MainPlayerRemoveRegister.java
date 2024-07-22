
package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.JogadorDAO;
import com.jpafutebolclube.model.Jogador;

/**
 *
 * @author leandro
 */
public class MainPlayerRemoveRegister {
    public static void main(String[] args) {
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.playerDel();
        //jogador.setId(2L);
        //System.out.println("REGISTRO ATUALIZADO: " + jogador);
    }
}
