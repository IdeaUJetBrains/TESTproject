package IDEA147985;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TODO create before reproducing a table in PostgreSQL
 CREATE TABLE public."MxWorkunit" (
 ID int PRIMARY KEY IDENTITY,
 BUSS varchar(255)
 );
 */
@Entity
public class MxWorkunit {
    private int column1;

    @Id
    @Column(name = "column_1", nullable = false)
    public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MxWorkunit that = (MxWorkunit) o;

        if (column1 != that.column1) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return column1;
    }
}
