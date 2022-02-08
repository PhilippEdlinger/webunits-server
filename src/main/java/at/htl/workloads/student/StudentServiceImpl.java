package at.htl.workloads.student;

import at.htl.models.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StudentServiceImpl implements StudentService {

    @Inject
    StudentRepo studentRepo;
    
    @Override
    public List<Student> getAll() {
        return this.studentRepo.getAll();
    }

}
