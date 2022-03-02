package at.htl.workloads.student;

import at.htl.models.Student;
import at.htl.models.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class TeacherRepo {

    @Inject
    EntityManager entityManager;

    public List<Teacher> getAll() {
        var query = this.entityManager
                .createQuery("select t from Teacher t", Teacher.class);
        return query.getResultList();
    }

    public Teacher get(Long id) {
        var query = entityManager.createQuery("select t from Teacher t where t.personId = :id", Teacher.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void add(Teacher teacher) {
        entityManager.persist(teacher);
    }

    public void remove(Teacher teacher) {
        entityManager.remove(teacher);
    }
}
