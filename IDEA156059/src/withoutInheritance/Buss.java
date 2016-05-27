package withoutInheritance;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 5/27/2016.
 */
@Entity
public class Buss {
    private int id;
    private String bussname;
    private Integer driverid;
    private Driver driverByDriverid;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BUSSNAME", nullable = true, length = 255)
    public String getBussname() {
        return bussname;
    }

    public void setBussname(String bussname) {
        this.bussname = bussname;
    }

    @Basic
    @Column(name = "DRIVERID", nullable = true)
    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buss buss = (Buss) o;

        if (id != buss.id) return false;
        if (bussname != null ? !bussname.equals(buss.bussname) : buss.bussname != null) return false;
        if (driverid != null ? !driverid.equals(buss.driverid) : buss.driverid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bussname != null ? bussname.hashCode() : 0);
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DRIVERID", referencedColumnName = "ID",
    insertable = false, updatable = false)
    public Driver getDriverByDriverid() {
        return driverByDriverid;
    }

    public void setDriverByDriverid(Driver driverByDriverid) {
        this.driverByDriverid = driverByDriverid;
    }
}
