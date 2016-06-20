package entities;

//import org.springframework.data.annotation.Id;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "IDEA145144_CITY", schema = "PUBLIC", catalog = "PUBLIC")
public class City implements Serializable {

   // private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private boolean state;
    private String country;
    private String map;

    public City() {
    }

    public City(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }

    @javax.persistence.Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STATE", nullable = false)
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = false, length = 255)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "MAP", nullable = false, length = 255)
    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City that = (City) o;

        if (id != that.id) return false;
        if (state != that.state) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (map != null ? !map.equals(that.map) : that.map != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (map != null ? map.hashCode() : 0);
        return result;
    }


}

