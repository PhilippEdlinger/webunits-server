package at.htl.models;

import javax.inject.Inject;
import javax.persistence.*;

@Entity
public class TableET {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;
    private Integer row;
    private Integer column;

    @ManyToOne
    RoomET room;

    public TableET() {
    }

    public TableET(Long tableId, Integer row, Integer column) {
        this.tableId = tableId;
        this.row = row;
        this.column = column;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
}
