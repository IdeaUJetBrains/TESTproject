package data1;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/5/2015.
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

//Driver = 1, he has many busses
    @OneToMany(mappedBy = "driversidfk")
    private Busses bussesId;
    public Busses getBussesId(){return bussesId;}

   /* @OneToMany(mappedBy = "driversid")
    private Collection<Busses> bussesId;
    public Collection<Busses> getBussesId(){return bussesId;}

    */


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        return result;
    }
}
