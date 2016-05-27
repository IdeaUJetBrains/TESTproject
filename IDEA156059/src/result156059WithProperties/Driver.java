package result156059WithProperties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 5/25/2016.
 */
@Entity
public class Driver {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String drivername;

    @Basic
    @javax.persistence.Column(name = "DRIVERNAME", nullable = true, length = 255)
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

        Driver driver = (Driver) o;

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

    private Collection<Buss> bussesById;
    @OneToMany(targetEntity = Buss.class, mappedBy = "driverById")
    public Collection<Buss> getBussesById() {
        return bussesById;
    }

    public void setBussesById(Collection<Buss> bussesById) {
        this.bussesById = bussesById;
    }

}
