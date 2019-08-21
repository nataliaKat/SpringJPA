/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springjpa.services;

import com.mycompany.springjpa.dao.TrainersDao;
import com.mycompany.springjpa.entities.Trainer;
import java.util.List;

/**
 *
 * @author kat26
 */
public class TrainersService {
    
    private TrainersDao tdao = new TrainersDao();
        
    public Trainer findById(int id) {
        return tdao.findById(id);
    }
    
    public List<Trainer> getAll() {
        return tdao.getAll();
    }
    
    public void deleteById(int id) {
        tdao.DeleteById(id);
    }
    
    public boolean insert(Trainer t) {
        StringBuilder uname = new StringBuilder();
        uname.append("trainer_").append(t.getLastName().substring(0, 4).toLowerCase())
                .append(t.getFirstName().substring(0, 2).toLowerCase()).append(t.getDob().toLocalDate().getYear());
        System.out.println(uname);
        t.setUsername(uname.toString());
        return tdao.InsertTrainer(t);
    }
    
    public boolean update(Trainer t) {
        return tdao.Update(t);
    }
    
}
