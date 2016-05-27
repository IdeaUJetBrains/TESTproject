package result156059WithFields;


import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 5/25/2016.
 */
@Entity
public class Driver {

    @Id
    @Column(name = "ID", nullable = false)
    public int id;


    @Basic
    @Column(name = "DRIVERNAME", nullable = true, length = 255)
    public String drivername;

    @OneToMany(targetEntity = Buss.class, mappedBy = "driverById")
    public Collection<Buss> bussesById;




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



}
