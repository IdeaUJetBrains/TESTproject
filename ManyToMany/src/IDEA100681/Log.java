package IDEA100681;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 4/12/2016.
 */
@Entity
//@Table(name = "LOG", schema = "PUBLIC", catalog = "PUBLIC")
public class Log {
    private int id;
    private Integer testfield;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TESTFIELD", nullable = true)
    public Integer getTestfield() {
        return testfield;
    }

    public void setTestfield(Integer testfield) {
        this.testfield = testfield;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Log log = (Log) o;

        if (id != log.id) return false;
        if (testfield != null ? !testfield.equals(log.testfield) : log.testfield != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (testfield != null ? testfield.hashCode() : 0);
        return result;
    }
}
