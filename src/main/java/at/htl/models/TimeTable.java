package at.htl.models;

import javax.persistence.*;

@Entity
public class TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long day;
    private Long lessonTime;

    @ManyToOne
    Subject subject;

     @ManyToOne
     Teacher teacher;

    @ManyToOne
    private RoomET roomET;

    public TimeTable() {}

    public TimeTable(Long id, Long day, Long lessonTime) {
        this.id = id;
        this.day = day;
        this.lessonTime = lessonTime;
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
}
