package com.jpafutebolclube.dao;

import com.jpafutebolclube.util.JpaEmUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class GenericDAO<T> {
    private EntityManager entityManager;
    private Class<T> genericClass;
    
    public GenericDAO(Class<T> genericClass) {
        this.genericClass = genericClass;
        entityManager = JpaEmUtil.openConnection();
    }
    
    public void salvar(T entity) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } finally {}
    }
    
    public void atualizar(T entity){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.flush();
            entityManager.getTransaction().commit();
        } finally{}
    }
    
    public T getByID(Long id) {
        return entityManager.find(genericClass, id);
    }
    
    public List<T> findAll() {
        String query = "SELECT j FROM Jogador j " + genericClass.getName() + " j";
        return entityManager.createQuery(query).getResultList();
    }
    
    
    
}
