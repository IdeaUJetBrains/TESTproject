package dataJoinTable;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
@Table(name = "BUSSES", schema = "PUBLIC", catalog = "PUBLIC")
public class Busses1 {
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

        Busses1 busses1 = (Busses1) o;

        if (id != busses1.id) return false;
        if (buss != null ? !buss.equals(busses1.buss) : busses1.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        return result;
    }

    private Collection<dataJoinTable.Test> driverIds;
    @ManyToMany
    @JoinTable(name = "BUSSDRIVERS",
            joinColumns = {@JoinColumn(name = "DRIVERID", referencedColumnName="ID")},
            inverseJoinColumns = {@JoinColumn(name = "BUSSID", referencedColumnName="ID")} )
    public Collection<dataJoinTable.Test> getDriverIds() { return driverIds; }

}
