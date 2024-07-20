package com.jpafutebolclube.service;

import com.jpafutebolclube.generic.GenericService;
import com.jpafutebolclube.model.Jogador;
import java.util.List;

/**
 *
 * @author leandro
 */

public class JogadorServico extends GenericService<Jogador> {
    public JogadorServico() {
        super(Jogador.class);
    }
    
    public List<Jogador> findByName(String nome){
        return null;
    }
    
    
}
