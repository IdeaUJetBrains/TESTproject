package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 6/21/2016.
 */
@Entity
public class Idea135936 {
    private int id;
    private Boolean boolcolumn;
    private Integer intcolumn;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BOOLCOLUMN", nullable = true)
    public Boolean getBoolcolumn() {
        return boolcolumn;
    }

    public void setBoolcolumn(Boolean boolcolumn) {
        this.boolcolumn = boolcolumn;
    }

    @Basic
    @Column(name = "INTCOLUMN", nullable = true)
    public Integer getIntcolumn() {
        return intcolumn;
    }

    public void setIntcolumn(Integer intcolumn) {
        this.intcolumn = intcolumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idea135936 that = (Idea135936) o;

        if (id != that.id) return false;
        if (boolcolumn != null ? !boolcolumn.equals(that.boolcolumn) : that.boolcolumn != null) return false;
        if (intcolumn != null ? !intcolumn.equals(that.intcolumn) : that.intcolumn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (boolcolumn != null ? boolcolumn.hashCode() : 0);
        result = 31 * result + (intcolumn != null ? intcolumn.hashCode() : 0);
        return result;
    }
}
