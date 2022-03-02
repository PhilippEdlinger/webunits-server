package at.htl.workloads.student;

import at.htl.models.RoomET;
import at.htl.models.Student;
import at.htl.models.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RoomService {

    @Inject
    RoomRepo roomRepo;

    public List<RoomET> getAll() {
        return this.roomRepo.getAll();
    }

    public RoomET get(Long id) {
        return roomRepo.get(id);
    }

    public void add(RoomET room) {
        roomRepo.add(room);
    }

    public void remove(Long id) {
        RoomET roomET = roomRepo.get(id);
        roomRepo.remove(roomET);
    }

}
