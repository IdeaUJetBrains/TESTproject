package idea99721.hbmfiles;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/8/2016.
 */
@Entity
public class Person99791 {
    private int id;
    private String name;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person99791 that = (Person99791) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    private Collection<Personphone99791> personphone99791sById;

    @OneToMany(mappedBy = "person99791ByPersonId")
    public Collection<Personphone99791> getPersonphone99791sById() {
        return personphone99791sById;
    }

    public void setPersonphone99791sById(Collection<Personphone99791> personphone99791sById) {
        this.personphone99791sById = personphone99791sById;
    }
}
