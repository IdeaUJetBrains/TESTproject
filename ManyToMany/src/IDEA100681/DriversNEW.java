package IDEA100681;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 4/13/2016.
 */
@Entity
@Table(name = "DRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class DriversNEW {
    private int id;
    private String buss;
    private Collection<BussdriversNEW> bussdriversesById;

    @Id
    @Column(name = "ID", nullable = false, table = "DRIVERS")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BUSS", nullable = true, length = 255)
    public String getBuss() {
        return buss;
    }

    public void setBuss(String buss) {
        this.buss = buss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriversNEW that = (DriversNEW) o;

        if (id != that.id) return false;
        if (buss != null ? !buss.equals(that.buss) : that.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "driversByBussid")
    public Collection<BussdriversNEW> getBussdriversesById() {
        return bussdriversesById;
    }

    public void setBussdriversesById(Collection<BussdriversNEW> bussdriversesById) {
        this.bussdriversesById = bussdriversesById;
    }
}
