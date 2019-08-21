package com.mycompany.springjpa.controllers;

import com.mycompany.springjpa.entities.Trainer;
import com.mycompany.springjpa.services.TrainersService;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/trainers")
public class TrainersController {

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateForm(ModelMap model, @PathVariable int id) {
        TrainersService ts = new TrainersService();
        Trainer t = ts.findById(id);
        model.addAttribute("trainer", t);

        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(ModelMap model, @RequestParam("id") int id, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("subject") String subject, @RequestParam("dob") Date dob, @RequestParam("username") String username) {
        TrainersService ts = new TrainersService();
        Trainer t = new Trainer(id, fname, lname, subject, dob, username);
        ts.update(t);
        model.addAttribute("action", "Update");

        return "success";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllTrainers(ModelMap model) {

        TrainersService ts = new TrainersService();
        List<Trainer> t = ts.getAll();
        model.addAttribute("trainers", t);
        return "trainers";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteById(ModelMap model, @PathVariable String id) {

        TrainersService ts = new TrainersService();
        ts.deleteById(Integer.parseInt(id));
        model.addAttribute("action", "Delete");

        return "success";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        return "insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(ModelMap model, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("subject") String subject, @RequestParam("dob") Date dob) {
        System.out.println("first name " + fname);
        TrainersService ts = new TrainersService();
        Trainer t = new Trainer(fname, lname, subject, dob);
        ts.insert(t);
        model.addAttribute("action", "Insert");

        return "success";
    }

}
