package at.htl.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Student extends Person {
    @ManyToOne
    private ClassET classET;

    @OneToMany(mappedBy = "studentTableId.student")
    private StudentTable studentTable;

    public Student() {}
}
