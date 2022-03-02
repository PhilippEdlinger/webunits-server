package at.htl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long day;
    private Long lessonTime;

    @OneToMany(mappedBy = "timeTable", cascade = CascadeType.REFRESH)
    private List<Subject> subjectList;

    @JsonIgnore
    @ManyToOne
    private Teacher teacher;

    @JsonIgnore
    @ManyToOne
    private RoomET roomET;

    @JsonIgnore
    @ManyToOne
    private SeatOrder seatOrder;

    public TimeTable() {
    }

    public TimeTable(Long day, Long lessonTime, List<Subject> subjectList, Teacher teacher, RoomET roomET, SeatOrder seatOrder) {
        this.day = day;
        this.lessonTime = lessonTime;
        this.subjectList = subjectList;
        this.teacher = teacher;
        this.roomET = roomET;
        this.seatOrder = seatOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Long getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(Long lessonTime) {
        this.lessonTime = lessonTime;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public RoomET getRoomET() {
        return roomET;
    }

    public void setRoomET(RoomET roomET) {
        this.roomET = roomET;
    }

    public SeatOrder getSeatOrder() {
        return seatOrder;
    }

    public void setSeatOrder(SeatOrder seatOrder) {
        this.seatOrder = seatOrder;
    }
}
