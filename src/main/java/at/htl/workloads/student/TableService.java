package at.htl.workloads.student;

import at.htl.models.TableET;
import at.htl.models.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class TableService {

    @Inject
    TableRepo tableRepo;

    public TableET get(Long id) {
        return tableRepo.get(id);
    }

    public void add(TableET tableET) {
        tableRepo.add(tableET);
    }

    public void remove(Long id) {
        TableET tableET = tableRepo.get(id);
        tableRepo.remove(tableET);
    }
}
