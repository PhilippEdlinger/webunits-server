package at.htl.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class StudentTable {

    @EmbeddedId
    private StudentTableId studentTableId;
    @ManyToOne
    private SeatOrder seatOrder;

    public StudentTableId getStudentTableId() {
        return studentTableId;
    }

    public void setStudentTableId(StudentTableId studentTableId) {
        this.studentTableId = studentTableId;
    }

    public SeatOrder getSeatOrder() {
        return seatOrder;
    }

    public void setSeatOrder(SeatOrder seatOrder) {
        this.seatOrder = seatOrder;
    }
}
