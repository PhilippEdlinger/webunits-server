package at.htl.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teacher extends Person {


    // classID FK
    @ManyToOne
    ClassET personClass;

    public Teacher() {}
}
