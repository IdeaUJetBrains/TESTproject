package onemorejoin;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Olga Pavlova on 11/4/2015.
 */
@Entity
@Table(name = "DRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class Drivers2 {
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

    private Map<Object, Busses2> bussID23;

    @MapKey(name = "id")
    @ManyToMany(mappedBy = "driverID23")
    public Map<Object, Busses2> getBussID23() {
        return bussID23;
    }

    public void setBussID23(Map<Object, Busses2> bussID23) {
        this.bussID23 = bussID23;
    }
}
