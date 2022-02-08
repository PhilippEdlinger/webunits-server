package at.htl.models;

import javax.persistence.*;

@Entity
public class SeatOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    RoomET room;

    public SeatOrder() {
    }

    public SeatOrder(Long id, RoomET room) {
        this.id = id;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoomET getRoom() {
        return room;
    }

    public void setRoom(RoomET room) {
        this.room = room;
    }
}
