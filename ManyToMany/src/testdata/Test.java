package testdata;

import dataJoinTable.Busses1;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
@Table(name = "DRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class Test {
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

        Test drivers1 = (Test) o;

        if (id != drivers1.id) return false;
        if (driver != null ? !driver.equals(drivers1.driver) : drivers1.driver != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "driverIds")
    private Collection<Busses1> bussIds;
    public Collection<Busses1> getBussIds(){return bussIds;}

}
