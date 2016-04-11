package dataLinkFromERDiagram;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
public class Busses {
    private int id;
    private String buss;

    @Id
    @Column(name = "ID", nullable = false)
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

        Busses busses = (Busses) o;

        if (id != busses.id) return false;
        if (buss != null ? !buss.equals(busses.buss) : busses.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        return result;
    }

    private Set driverId;
    @ManyToMany(mappedBy = "bussId")
    public Set getDriverId() {
        return driverId;
    }
    public void setDriverId(Set driverId) {
        this.driverId = driverId;
    }
}

