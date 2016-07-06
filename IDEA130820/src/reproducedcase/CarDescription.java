package reproducedcase;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/6/2016.
 */
@Entity
@Table(name = "CAR_DESCRIPTION", schema = "PUBLIC", catalog = "PUBLIC")
public class CarDescription {
    private int id;
    private Integer carLDesc;
    private Integer bid;
    private Collection<Car> carsById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CAR_L_DESC", nullable = true)
    public Integer getCarLDesc() {
        return carLDesc;
    }

    public void setCarLDesc(Integer carLDesc) {
        this.carLDesc = carLDesc;
    }

    @Basic
    @Column(name = "BID", nullable = true)
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarDescription that = (CarDescription) o;

        if (id != that.id) return false;
        if (carLDesc != null ? !carLDesc.equals(that.carLDesc) : that.carLDesc != null) return false;
        if (bid != null ? !bid.equals(that.bid) : that.bid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (carLDesc != null ? carLDesc.hashCode() : 0);
        result = 31 * result + (bid != null ? bid.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "carDescriptionByCarDesc")
    public Collection<Car> getCarsById() {
        return carsById;
    }

    public void setCarsById(Collection<Car> carsById) {
        this.carsById = carsById;
    }
}
