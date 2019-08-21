/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springjpa.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;//τα βασικά για να λειτουργήσει το jpa
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;//για πολλά queries
import javax.persistence.NamedQuery;//για ένα query
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;//Root<>

/**
 *
 * @author kat26
 */
@Entity
@Table(name = "trainer", catalog = "bootcampdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t")
    , @NamedQuery(name = "Trainer.findByTrainerId", query = "SELECT t FROM Trainer t WHERE t.trainerId = :trainerId")
    , @NamedQuery(name = "Trainer.findByFirstName", query = "SELECT t FROM Trainer t WHERE t.firstName = :firstName")
    , @NamedQuery(name = "Trainer.findByLastName", query = "SELECT t FROM Trainer t WHERE t.lastName = :lastName")
    , @NamedQuery(name = "Trainer.deleteById", query = "DELETE FROM Trainer t WHERE t.trainerId = :id")
    , @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    @Basic(optional = false)
    @Column(name = "id", nullable = false)//add column ...
    private Integer trainerId;
    @Basic(optional = false)//το JPA εσωτερικά
    @NotNull//back end validation(γυρίζει bind exception error)
    @Size(min = 3, max = 45)//back end validation(γυρίζει bind exception error)
    @Column(name = "fname", nullable = false, length = 45)//πώε είναι η γραμμή εκεί φτιαγμένη(varchar(45))
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lname", nullable = false, length = 45)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String subject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dob", nullable = false)
    private Date dob;
    @Basic(optional = false)
    @NotNull
    @Column(name = "username", nullable = false, length = 40)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Trainer() {
    }

    public Trainer(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Trainer(Integer trainerId, String firstName, String lastName, String subject, Date dob, String username) {
        this.trainerId = trainerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.dob = dob;
        this.username = username;
    }
       public Trainer(String firstName, String lastName, String subject, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.dob = dob;
    }


    public Trainer(String firstName, String lastName, String subject, Date dob, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.dob = dob;
        this.username = username;
    }

 

    public Trainer(Integer trainerId, String firstName, String lastName, String subject, Date dob) {
        this.trainerId = trainerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.dob = dob;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerId != null ? trainerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerId == null && other.trainerId != null) || (this.trainerId != null && !this.trainerId.equals(other.trainerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainerId=" + trainerId + ", firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + ", dob=" + dob + '}';
    }

}
