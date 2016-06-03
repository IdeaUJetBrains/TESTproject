package result156059WithProperties;

import javax.persistence.*;

//@Entity
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractBuss {
    private int id;
    private String bussname;
    private Integer driverid;
    private Driver driverById;

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

        if (id != buss.getId()) return false;
        if (bussname != null ? !bussname.equals(buss.getBussname()) : buss.getBussname() != null) return false;
        if (driverid != null ? !driverid.equals(buss.getDriverid()) : buss.getDriverid() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bussname != null ? bussname.hashCode() : 0);
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        return result;
    }




    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "DRIVERID", nullable = false, referencedColumnName = "ID", insertable = false, updatable = false)
    public Driver getDriverById() {
        return driverById;
    }

    public void setDriverById(Driver driverById) {
        this.driverById = driverById;
    }


}
