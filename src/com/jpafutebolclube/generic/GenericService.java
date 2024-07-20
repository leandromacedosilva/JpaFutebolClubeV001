package com.jpafutebolclube.generic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author leandro
 */
public class GenericService<T> {
    private Class<T> entity;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public GenericService(Class<T> entity) {
        this.entity = entity;
    }
    
    public void salvar(T entity) {
        entityManager.persist(entity);
    }
    
    public void atualizar(T entity) {
        entityManager.merge(entity);
    }
    
    public void remover(T entity) {}
    
    public List<T> allFind() {
        String query = "SELECT e FROM " + entity.getName() + " e";
        return entityManager.createQuery(query).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
}
