package IDEA146324;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 6/6/2016.
 */
@Entity
@Table(name = "TESTSYN")
public class Idea146324 {
    private long id;
    private Long col1;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "COL1", nullable = true, precision = 0)
    public Long getCol1() {
        return col1;
    }

    public void setCol1(Long col1) {
        this.col1 = col1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idea146324 that = (Idea146324) o;

        if (id != that.id) return false;
        if (col1 != null ? !col1.equals(that.col1) : that.col1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (col1 != null ? col1.hashCode() : 0);
        return result;
    }
}
