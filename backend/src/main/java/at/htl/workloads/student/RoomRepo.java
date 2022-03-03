package at.htl.workloads.student;

import at.htl.models.RoomET;
import at.htl.models.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;


@ApplicationScoped
public class RoomRepo {

    @Inject
    EntityManager  entityManager;

    public List<RoomET> getAll() {
        var query = this.entityManager
                .createQuery("select r from RoomET r", RoomET.class);
        return query.getResultList();
    }

    public RoomET get(Long id) {
        var query = entityManager.createQuery("select r from RoomET r where r.id = :id", RoomET.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void add(RoomET room) {
        entityManager.persist(room);
    }

    public void update(RoomET room) {
        entityManager.merge(room);
    }

    public void remove(RoomET room) {
        entityManager.remove(room);
    }


}
