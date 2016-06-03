package IDEA155378;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Olga Pavlova on 6/3/2016.
 */
@Entity
public class Publication {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private Date year;
    @Basic
    @Column(name = "YEAR")
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publication that = (Publication) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    private Collection<Testidea15537> testidea15537sById;

    @OneToMany(mappedBy = "publication")
    public Collection<Testidea15537> getTestidea15537sById() {
        return testidea15537sById;
    }

    public void setTestidea15537sById(Collection<Testidea15537> testidea15537sById) {
        this.testidea15537sById = testidea15537sById;
    }


}
