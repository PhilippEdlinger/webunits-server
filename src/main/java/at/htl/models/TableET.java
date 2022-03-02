package at.htl.models;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;

@Entity
public class TableET {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;
    private Integer rowNR;
    private Integer columnNR;

    @ManyToOne
    RoomET room;

    @OneToMany(mappedBy = "studentTableId.tableET")
    private List<StudentTable> studentTableList;

    public TableET() {
    }

    public TableET(Long tableId, Integer rowNR, Integer columnNR, RoomET room, List<StudentTable> studentTableList) {
        this.tableId = tableId;
        this.rowNR = rowNR;
        this.columnNR = columnNR;
        this.room = room;
        this.studentTableList = studentTableList;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public Integer getRowNR() {
        return rowNR;
    }

    public void setRowNR(Integer rowNR) {
        this.rowNR = rowNR;
    }

    public Integer getColumnNR() {
        return columnNR;
    }

    public void setColumnNR(Integer columnNR) {
        this.columnNR = columnNR;
    }

    public RoomET getRoom() {
        return room;
    }

    public void setRoom(RoomET room) {
        this.room = room;
    }

    public List<StudentTable> getStudentTableList() {
        return studentTableList;
    }

    public void setStudentTableList(List<StudentTable> studentTableList) {
        this.studentTableList = studentTableList;
    }
}
