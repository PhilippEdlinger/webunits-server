package at.htl.workloads.student;

import at.htl.models.Student;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

public interface StudentService {

    List<Student> getAll();
}
