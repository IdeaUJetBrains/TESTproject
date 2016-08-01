package idea158533;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 7/29/2016.
 */
@Entity
@Table(name = "IDEA158533DRIVERONE")
public class Idea158533Driverone {
    private int id;
    

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

        Idea158533Driverone that = (Idea158533Driverone) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "idea158533DriveroneByDriverid")
    private Set<Auto> AutosById = new HashSet<>();
    
    public Set<Auto> getAutosById() {
        return AutosById;
    }

    public void setAutosById(Set<Auto> autosById) {
        this.AutosById = autosById;
    }
}
