package dataLinkFromERDiagram;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
public class Drivers {
    private int id;
    private String driver;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DRIVER", nullable = true, length = 255)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String buss) {
        this.driver = buss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers drivers = (Drivers) o;

        if (id != drivers.id) return false;
        if (driver != null ? !driver.equals(drivers.driver) : drivers.driver != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        return result;
    }

    private Collection<Busses> bussId;
    @ManyToMany
    public Collection<Busses> getBussId() {
        return bussId;
    }
    public void setBussId(Collection<Busses> bussId) {
        this.bussId = bussId;
    }
}
