package at.htl.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher extends Person {


    // classID FK
    @OneToOne(mappedBy = "classTeacher")
    private ClassET personClass;

    @OneToMany(mappedBy = "teacher")
    private List<TimeTable> timeTableList;

    public Teacher() {}

    public Teacher(String firstName, String lastName, ClassET personClass, List<TimeTable> timeTableList) {
        super(firstName, lastName);
        this.personClass = personClass;
        this.timeTableList = timeTableList;
    }

    public ClassET getPersonClass() {
        return personClass;
    }

    public void setPersonClass(ClassET personClass) {
        this.personClass = personClass;
    }

    public List<TimeTable> getTimeTableList() {
        return timeTableList;
    }

    public void setTimeTableList(List<TimeTable> timeTableList) {
        this.timeTableList = timeTableList;
    }
}
