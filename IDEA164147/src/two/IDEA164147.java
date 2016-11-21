package two;

import javax.persistence.*;

@Entity
@Table(name = "IDEA164147", schema = "TESTSCHEMA")
public class IDEA164147 {
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

        IDEA164147 entitybus = (IDEA164147) o;

        if (id != entitybus.id) return false;
        if (number != null ? !number.equals(entitybus.number) : entitybus.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
