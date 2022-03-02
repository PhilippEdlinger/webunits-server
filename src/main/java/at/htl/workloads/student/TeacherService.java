package at.htl.workloads.student;

import at.htl.models.Student;
import at.htl.models.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class TeacherService {

    @Inject
    TeacherRepo teacherRepo;

    public List<Teacher> getAll() {
        return this.teacherRepo.getAll();
    }

    public Teacher get(Long id) {
        return teacherRepo.get(id);
    }

    public void add(Teacher teacher) {
        teacherRepo.add(teacher);
    }

    public void remove(Teacher teacher) {
        teacherRepo.remove(teacher);
    }

}