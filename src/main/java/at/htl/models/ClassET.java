package at.htl.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClassET {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    TimeTable timeTable;

    @OneToMany(mappedBy = "classET", cascade = CascadeType.ALL)
    private List<Student> studentList;

    @OneToOne
    private Teacher classTeacher;

    public ClassET() {
    }

    public ClassET(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
