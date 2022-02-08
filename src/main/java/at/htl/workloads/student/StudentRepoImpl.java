package at.htl.workloads.student;

import at.htl.models.Student;
import javax.persistence.EntityManager;

import javax.inject.Inject;
import java.util.List;

public class StudentRepoImpl implements StudentRepo{

    @Inject
    EntityManager entityManager;

    public List<Student> getAll() {
        var query = this.entityManager
                .createQuery("select s from Student s", Student.class);
        return query.getResultList();
    }
}
