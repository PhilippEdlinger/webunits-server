package at.htl.models;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class StudentTableId implements Serializable {
    @ManyToOne
    private Student student;
    @ManyToOne
    private TableET tableET;


}
