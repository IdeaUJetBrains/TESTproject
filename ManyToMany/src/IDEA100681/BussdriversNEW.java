package IDEA100681;

import javax.persistence.*;
import javax.persistence.Table;
/**
 * Created by Olga Pavlova on 4/13/2016.
 */
@Entity
@Table(name = "BUSSDRIVERS")
//@Table(name = "BUSSDRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class BussdriversNEW {
    private Integer bussid;
    private Integer driverid;
    private int id;
    private BussesNEW bussesByDriverid;
    private DriversNEW driversByBussid;

    @Basic
    @Column(name = "BUSSID", nullable = true)
    public Integer getBussid() {
        return bussid;
    }

    public void setBussid(Integer bussid) {
        this.bussid = bussid;
    }

    @Basic
    @Column(name = "DRIVERID", nullable = true)
    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BussdriversNEW that = (BussdriversNEW) o;

        if (id != that.id) return false;
        if (bussid != null ? !bussid.equals(that.bussid) : that.bussid != null) return false;
        if (driverid != null ? !driverid.equals(that.driverid) : that.driverid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bussid != null ? bussid.hashCode() : 0;
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DRIVERID", referencedColumnName = "ID")
    public BussesNEW getBussesByDriverid() {
        return bussesByDriverid;
    }

    public void setBussesByDriverid(BussesNEW bussesByDriverid) {
        this.bussesByDriverid = bussesByDriverid;
    }

    @ManyToOne
    @JoinColumn(name = "BUSSID", referencedColumnName = "ID")
    public DriversNEW getDriversByBussid() {
        return driversByBussid;
    }

    public void setDriversByBussid(DriversNEW driversByBussid) {
        this.driversByBussid = driversByBussid;
    }
}
