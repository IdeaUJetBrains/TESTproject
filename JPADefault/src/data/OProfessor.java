package data;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Olga Pavlova on 3/31/2016.
 */
@Entity
@Table(name = "PROFESSOR", schema = "PUBLIC", catalog = "PUBLIC")
public class OProfessor {
    private int id;
    private String name;
    private byte[] salary;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true ,length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SALARY", nullable = true)
    public byte[] getSalary() {
        return salary;
    }

    public void setSalary(byte[] salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OProfessor that = (OProfessor) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (!Arrays.equals(salary, that.salary)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(salary);
        return result;
    }
}
