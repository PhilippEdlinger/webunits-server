package at.htl.workloads.student;

import at.htl.models.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StudentService {

    @Inject
    StudentRepo studentRepo;

    public List<Student> getAll() {
        return this.studentRepo.getAll();
    }

    public Student get(Long id) {
        return studentRepo.get(id);
    }

    public void add(Student student) {
        studentRepo.add(student);
    }

    public void remove(Student student) {
        studentRepo.remove(student);
    }
}
