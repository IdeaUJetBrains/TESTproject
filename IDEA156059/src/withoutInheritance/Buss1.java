package withoutInheritance;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 5/27/2016.
 */
@Entity
@Table(name = "BUSS")
public class Buss1 {
    private int id;
    private String buss1name;

    private Integer driverid;
    private Driver1 driverByDriverid;

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
    public String getBuss1name() {
        return buss1name;
    }

    public void setBuss1name(String buss1name) {
        this.buss1name = buss1name;
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

        Buss1 buss1 = (Buss1) o;

        if (id != buss1.id) return false;
        if (buss1name != null ? !buss1name.equals(buss1.buss1name) : buss1.buss1name != null) return false;
        if (driverid != null ? !driverid.equals(buss1.driverid) : buss1.driverid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss1name != null ? buss1name.hashCode() : 0);
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DRIVERID", referencedColumnName = "ID",
            insertable = false, updatable = false)
    public Driver1 getDriverByDriverid() {
        return driverByDriverid;
    }

    public void setDriverByDriverid(Driver1 driverByDriverid) {
        this.driverByDriverid = driverByDriverid;
    }
}
