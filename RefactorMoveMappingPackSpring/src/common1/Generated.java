package common1;


import javax.persistence.*;

@Entity
@Table(name = "DRIVERS", schema = "PUBLIC", catalog = "PUBLIC")
public class Generated {
    private int id;
    private String buss;


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

        Generated that = (Generated) o;

        if (id != that.id) return false;
        if (buss != null ? !buss.equals(that.buss) : that.buss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss != null ? buss.hashCode() : 0);
        return result;
    }
}
