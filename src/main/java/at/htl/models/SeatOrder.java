package at.htl.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class SeatOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "seatOrder")
    private List<StudentTable> studentTableList;

    @ManyToOne
    private TimeTable timeTable;

    public SeatOrder() {
    }

    public SeatOrder(Long id, List<StudentTable> studentTableList, TimeTable timeTable) {
        this.id = id;
        this.studentTableList = studentTableList;
        this.timeTable = timeTable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<StudentTable> getStudentTableList() {
        return studentTableList;
    }

    public void setStudentTableList(List<StudentTable> studentTableList) {
        this.studentTableList = studentTableList;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }
}
