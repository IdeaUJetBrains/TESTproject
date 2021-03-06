package withoutInheritance;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 5/27/2016.
 */
@Entity
@Table(name = "DRIVER")
public class Driver1 {
    private int id;
    private String drivername;
    private Collection<Buss1> busses1ById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DRIVERNAME", nullable = true, length = 255)
    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver1 driver = (Driver1) o;

        if (id != driver.id) return false;
        if (drivername != null ? !drivername.equals(driver.drivername) : driver.drivername != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (drivername != null ? drivername.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "driverByDriverid")
    public Collection<Buss1> getBusses1ById() {
        return busses1ById;
    }

    public void setBusses1ById(Collection<Buss1> bussesById) {
        this.busses1ById = bussesById;
    }
}
