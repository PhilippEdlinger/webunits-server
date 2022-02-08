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

}
