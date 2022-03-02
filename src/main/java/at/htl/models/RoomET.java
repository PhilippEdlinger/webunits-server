package at.htl.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class RoomET {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "room")
    private List<TableET> tableETList;

    public RoomET() {
    }

    public RoomET(Long id, String name, List<TableET> tableETList) {
        this.id = id;
        this.name = name;
        this.tableETList = tableETList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TableET> getTableETList() {
        return tableETList;
    }

    public void setTableETList(List<TableET> tableETList) {
        this.tableETList = tableETList;
    }
}
