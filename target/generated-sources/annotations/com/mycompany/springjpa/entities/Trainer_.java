package com.mycompany.springjpa.entities;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-21T13:21:51")
@StaticMetamodel(Trainer.class)
public class Trainer_ { 

    public static volatile SingularAttribute<Trainer, String> firstName;
    public static volatile SingularAttribute<Trainer, String> lastName;
    public static volatile SingularAttribute<Trainer, String> subject;
    public static volatile SingularAttribute<Trainer, Date> dob;
    public static volatile SingularAttribute<Trainer, Integer> trainerId;
    public static volatile SingularAttribute<Trainer, String> username;

}