/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springjpa.dao;

import com.mycompany.springjpa.entities.Trainer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author kat26
 */
public class TrainersDao {

    private static EntityManagerFactory emf;

    private EntityManager makeEntityManager() {
        emf = javax.persistence.Persistence.createEntityManagerFactory("com.mycompany_SpringJPA_war_1.0-SNAPSHOTPU");

        return emf.createEntityManager();
    }

    private void closeManager(EntityManager em) {
        em.close();
        emf.close();
    }

    public Trainer findById(int id) {
        EntityManager em = makeEntityManager();
        Trainer t = (Trainer) em.createNamedQuery("Trainer.findByTrainerId").setParameter("trainerId", id)
                .getSingleResult();
        closeManager(em);

        return t;
    }

    public List<Trainer> getAll() {
        EntityManager em = makeEntityManager();
        List<Trainer> trainers = em.createNamedQuery("Trainer.findAll").getResultList();
        closeManager(em);

        return trainers;
    }

    public boolean DeleteById(int id) {
        EntityManager em = makeEntityManager();
        em.getTransaction().begin();

        try {
            System.out.println(em.createNamedQuery("Trainer.deleteById").setParameter("id", id).executeUpdate());

            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception");
            return false;

        }

        em.close();
        return true;
    }

    public boolean InsertTrainer(Trainer t) {
        boolean completed = false;
        EntityManager em = makeEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(t);
            em.getTransaction().commit();
            completed = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            closeManager(em);
        }
        return completed;
    }
    
    public boolean Update(Trainer t) {
         boolean completed = false;
        EntityManager em = makeEntityManager();

        Trainer foundTrainer = em.find(Trainer.class, t.getTrainerId());
        foundTrainer.setFirstName(t.getFirstName());
        foundTrainer.setLastName(t.getLastName());
        foundTrainer.setSubject(t.getSubject());
        foundTrainer.setDob(t.getDob());
        foundTrainer.setUsername(t.getUsername());
        em.getTransaction().begin();
        try {
            //transaction
            em.persist(foundTrainer);
            em.getTransaction().commit();
            completed = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            closeManager(em);
        }
                
        return completed;
    }
    

}
