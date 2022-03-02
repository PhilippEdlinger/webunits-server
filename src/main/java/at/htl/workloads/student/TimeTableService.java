package at.htl.workloads.student;

import at.htl.models.TimeTable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TimeTableService {
    @Inject
    private TimeTableRepo repo;

    public void add(TimeTable timeTable) {
        repo.add(timeTable);
    }

    public void remove(Long id) {
        TimeTable timeTable = repo.get(id);
        repo.remove(timeTable);
    }

    public TimeTable get(Long id) {
        return repo.get(id);
    }
}
