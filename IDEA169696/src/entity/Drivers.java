package entity;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 4/11/2016.
 */
@Entity
@Table(name = "DRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class Drivers {
    private int id;
    private String buss;
    private Integer column3;

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

        Drivers that = (Drivers) o;

        if (id != that.id) return false;
        if (buss != null ? !buss.equals(that.buss) : that.buss != null) return false;
        if (column3 != null ? !column3.equals(that.column3) : that.column3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        result = 31 * result + (column3 != null ? column3.hashCode() : 0);
        return result;
    }
}
