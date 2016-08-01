package idea99721.elementcollection;


import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/8/2016.
 */
@Entity
@Table(name = "PERSON99791")
public class Person {
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

        Person that = (Person) o;

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



    @ElementCollection
    @CollectionTable(name="PERSONPHONE99791", joinColumns = @JoinColumn(name = "PERSON_ID"))
    private Collection<Phone> phonesById;
    public Collection<Phone> getPhonesById() {
        return phonesById;
    }

    public void setPhonesById(Collection<Phone> phonesById) {
        this.phonesById = phonesById;
    }
}
