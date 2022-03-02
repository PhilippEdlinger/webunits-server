package at.htl.models;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentTableId implements Serializable {
    @ManyToOne
    private Student student;
    @ManyToOne
    private TableET tableET;

    public StudentTableId() {
    }

    public StudentTableId(Student student, TableET tableET) {
        this.student = student;
        this.tableET = tableET;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TableET getTableET() {
        return tableET;
    }

    public void setTableET(TableET tableET) {
        this.tableET = tableET;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentTableId that = (StudentTableId) o;
        return student.equals(that.student) && tableET.equals(that.tableET);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, tableET);
    }
}
