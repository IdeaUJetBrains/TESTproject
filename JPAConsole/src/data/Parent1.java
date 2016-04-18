package data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Entity
//@Table(name = "PARENT")
public class Parent1 {
    private int id;
    private Integer bugName;

    @Id
    //@Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    //@Column(name = "BUG_NAME", nullable = true)
    public Integer getBugName() {
        return bugName;
    }

    public void setBugName(Integer bugName) {
        this.bugName = bugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent1 parent = (Parent1) o;

        if (id != parent.id) return false;
        if (bugName != null ? !bugName.equals(parent.bugName) : parent.bugName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bugName != null ? bugName.hashCode() : 0);
        return result;
    }
}
