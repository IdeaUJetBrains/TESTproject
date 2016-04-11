package onemorejoin;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */
@Entity
@Table(name = "BUSSES", schema = "PUBLIC", catalog = "PUBLIC")
public class Busses6 {
    private String buss;

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

        Busses6 busses6 = (Busses6) o;

        if (buss != null ? !buss.equals(busses6.buss) : busses6.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return buss != null ? buss.hashCode() : 0;
    }
}
