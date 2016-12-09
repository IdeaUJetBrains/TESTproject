package onduplicate;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 12/9/2016.
 */
@Entity
@Table(name = "BUS", schema = "DOCKERDB", catalog = "")
public class BusTest {
    private int id;
    private String number;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NUMBER", nullable = true, length = 255)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusTest busTest = (BusTest) o;

        if (id != busTest.id) return false;
        if (number != null ? !number.equals(busTest.number) : busTest.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
