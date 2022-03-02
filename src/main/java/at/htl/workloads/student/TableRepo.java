package at.htl.workloads.student;

import at.htl.models.TableET;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class TableRepo {

    @Inject
    private EntityManager entityManager;

    public TableET get(Long id) {
        var query = entityManager.createQuery("select t from TableET t where t.tableId = : id", TableET.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void add(TableET tableET) {
        entityManager.persist(tableET);
    }

    public void remove(TableET tableET) {
        entityManager.remove(tableET);
    }
}
