package at.htl.workloads.student;

import at.htl.models.Student;
import at.htl.models.StudentTable;
import at.htl.models.TableET;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class StudentTableService {
    @Inject
    private StudentRepo studentRepo;

    public void add(StudentTable studentTable, Long studentId) {
        Student student = studentRepo.get(studentId);

        student.addStudentTable(studentTable);

        this.studentRepo.update(student);
    }

    public void remove(Long tableId, Long studentId) {
        Student student = this.studentRepo.get(studentId);
        TableET tableET = this.studentRepo.
        StudentTable studentTable = this.studentRepo.getStudentTable()
    }

}
