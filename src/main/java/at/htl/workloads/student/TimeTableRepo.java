package at.htl.workloads.student;

import at.htl.models.TimeTable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class TimeTableRepo {
    @Inject
    private EntityManager entityManager;

    public TimeTable get(Long id) {
        var query = entityManager.createQuery("select t from TimeTable t where t.id = :id", TimeTable.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void add(TimeTable timeTable) {
        entityManager.persist(timeTable);
    }

    public void remove(TimeTable timeTable) {
        entityManager.remove(timeTable);
    }
}