package at.htl.workloads.student;

import at.htl.models.Student;
import at.htl.models.StudentTable;
import at.htl.models.StudentTableId;
import at.htl.models.TableET;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class StudentTableService {
    @Inject
    private StudentRepo studentRepo;
    @Inject
    private TableRepo tableRepo;

    public void add(StudentTable studentTable, Long studentId) {
        Student student = studentRepo.get(studentId);

        student.addStudentTable(studentTable);

        this.studentRepo.update(student);
    }

    public void remove(Long tableId, Long studentId) {
        Student student = this.studentRepo.get(studentId);
        TableET tableET = this.tableRepo.get(tableId);
        StudentTableId studentTableId = new StudentTableId(student, tableET);
        
        StudentTable studentTable = this.studentRepo.getStudentTable(studentTableId);

        student.removeStudentTable(studentTable);

        this.studentRepo.update(student);
    }

}
