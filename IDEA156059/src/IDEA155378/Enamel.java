package IDEA155378;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 6/3/2016.
 */
@Entity
@Table(name = "ENAMEL")
public class Enamel {
    private int id;
    private Collection<Testidea15537> testidea15537sById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enamel enamel = (Enamel) o;

        if (id != enamel.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @OneToMany(mappedBy = "enamel")
    public Collection<Testidea15537> getTestidea15537sById() {
        return testidea15537sById;
    }

    public void setTestidea15537sById(Collection<Testidea15537> testidea15537sById) {
        this.testidea15537sById = testidea15537sById;
    }
}
