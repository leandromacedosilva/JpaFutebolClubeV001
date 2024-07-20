package com.jpafutebolclube.service;

import com.jpafutebolclube.generic.GenericService;
import com.jpafutebolclube.model.Jogador;
import java.util.List;
import javax.persistence.metamodel.StaticMetamodel;

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
