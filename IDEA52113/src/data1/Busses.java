package data1;




import org.hibernate.annotations.Cascade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */
@Entity
public class Busses {
    private int id;
    private String buss;
    private int driversid;

    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "BUSS", nullable = true, length = 255)
    public String getBuss() {
        return buss;
    }

    public void setBuss(String buss) {
        this.buss = buss;
    }


    private Drivers driversidfk;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JoinColumn(name = "DRIVERSID", referencedColumnName="ID", nullable = true, unique = true)
    public Drivers getDriversidfk() {
        return driversidfk;
    }
    public void setDriversidfk(Drivers driversid) {
        this.driversidfk = driversid;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Busses busses = (Busses) o;

        if (id != busses.id) return false;
        if (buss != null ? !buss.equals(busses.buss) : busses.buss != null) return false;
        if (driversidfk != null ? !driversidfk.equals(busses.driversidfk) : busses.driversidfk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        result = 31 * result + (driversidfk != null ? driversidfk.hashCode() : 0);
        return result;
    }
}
