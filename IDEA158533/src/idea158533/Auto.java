package idea158533;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 7/29/2016.
 */
@Entity
@Table(name = "IDEA158533AUTOMANY")
public class Auto {
    private int autoid;
    private Integer driverid;
    private Idea158533Driverone idea158533DriveroneByDriverid;

    @Id
    @Column(name = "AUTOID", nullable = false)
    public int getAutoid() {
        return autoid;
    }

    public void setAutoid(int autoid) {
        this.autoid = autoid;
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

        Auto that = (Auto) o;

        if (autoid != that.autoid) return false;
        if (driverid != null ? !driverid.equals(that.driverid) : that.driverid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autoid;
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DRIVERID", referencedColumnName = "ID")
    public Idea158533Driverone getIdea158533DriveroneByDriverid() {
        return idea158533DriveroneByDriverid;
    }

    public void setIdea158533DriveroneByDriverid(Idea158533Driverone idea158533DriveroneByDriverid) {
        this.idea158533DriveroneByDriverid = idea158533DriveroneByDriverid;
    }
}
