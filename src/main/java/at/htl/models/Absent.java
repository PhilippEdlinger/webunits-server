package at.htl.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Absent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Student student;

    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private Long lessonTime;

    public Absent() {
    }

    public Absent(Long id, Student student, LocalDateTime timeStart, LocalDateTime timeEnd, Long lessonTime) {
        this.id = id;
        this.student = student;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.lessonTime = lessonTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Long getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(Long lessonTime) {
        this.lessonTime = lessonTime;
    }
}
