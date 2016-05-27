package result156059WithFields;



import javax.persistence.*;

//@Entity
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractBuss {

    @Id
    @Column(name = "ID", nullable = false)
    public int id;

    @Basic
    @Column(name = "BUSSNAME", nullable = true, length = 255)
    public String bussname;

    @Basic
    @Column(name = "DRIVERID", nullable = true)
    public Integer driverid;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "DRIVERID", nullable = false, referencedColumnName = "ID", insertable = false, updatable = false)
    public Driver driverById;








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







}
