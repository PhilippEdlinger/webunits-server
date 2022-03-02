package at.htl.workloads.student;

import at.htl.models.*;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StudentRepo {

    @Inject
    EntityManager entityManager;

    public List<Student> getAll() {
        var query = this.entityManager
                .createQuery("select s from Student s", Student.class);
        return query.getResultList();
    }

    public Student get(Long id) {
        var query = entityManager.createQuery("select s from Student s where s.personId = :id", Student.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void add(Student student) {
        entityManager.persist(student);
    }

    public void update(Student student) {
        entityManager.merge(student);
    }

    public void remove(Student student) {
        entityManager.remove(student);
    }

    public StudentTable getStudentTable(StudentTableId id) {
        var query = entityManager.createQuery("select st from StudentTable st where st.studentTableId = :id", StudentTable.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public Absent getAbsent(Long id) {
        var query = entityManager.createQuery("select a from Absent a where a.id = :id", Absent.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public ClassET getClassET(Long id) {
        var query = entityManager.createQuery("select c from ClassET c where c.id = :id", ClassET.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
