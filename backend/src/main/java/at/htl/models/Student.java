package at.htl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Student extends Person {
    @JsonIgnore
    @ManyToOne
    private ClassET classET;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Absent> absentList;
    @OneToMany(mappedBy = "studentTableId.student", cascade = CascadeType.ALL)
    private List<StudentTable> studentTables;

    public Student() {
    }

    public Student(String firstName, String lastName, ClassET classET, List<Absent> absentList, List<StudentTable> studentTables) {
        super(firstName, lastName);
        this.classET = classET;
        this.absentList = absentList;
        this.studentTables = studentTables;
    }

    public void addAbsent(Absent absent) {
        this.absentList.add(absent);
    }

    public void removeAbsent(Absent absent) {
        this.absentList.remove(absent);
    }

    public void addStudentTable(StudentTable studentTable) {
        this.studentTables.add(studentTable);
    }

    public void removeStudentTable(StudentTable studentTable) {
        this.studentTables.remove(studentTable);
    }

    public ClassET getClassET() {
        return classET;
    }

    public void setClassET(ClassET classET) {
        this.classET = classET;
    }

    public List<Absent> getAbsentList() {
        return absentList;
    }

    public void setAbsentList(List<Absent> absentList) {
        this.absentList = absentList;
    }

    public List<StudentTable> getStudentTables() {
        return studentTables;
    }

    public void setStudentTables(List<StudentTable> studentTables) {
        this.studentTables = studentTables;
    }
}
