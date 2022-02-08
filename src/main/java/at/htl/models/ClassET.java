package at.htl.models;

import javax.persistence.*;

@Entity
public class ClassET {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    SeatOrder seatOrder;

    @ManyToOne
    TimeTable timeTable;

    public ClassET() {
    }

    public ClassET(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SeatOrder getSeatOrder() {
        return seatOrder;
    }

    public void setSeatOrder(SeatOrder seatOrder) {
        this.seatOrder = seatOrder;
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

}
