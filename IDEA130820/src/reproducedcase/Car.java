package reproducedcase;

import org.hibernate.annotations.OptimisticLock;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Olga Pavlova on 7/6/2016.
 */
@Entity
public class Car {
    private int id;
    private CarDescription carDescriptionByCarDesc;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "CAR_DESC", referencedColumnName = "ID")
    public CarDescription getCarDescriptionByCarDesc() {
        return carDescriptionByCarDesc;
    }

    public void setCarDescriptionByCarDesc(CarDescription carDescriptionByCarDesc) {
        this.carDescriptionByCarDesc = carDescriptionByCarDesc;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id.carRu", orphanRemoval = true)
    @MapKey(name = "id.carDe")
    @OptimisticLock(excluded = true)
    private final Map<CarDe, CarLanguage1> CarLanguage1var = new java.util.HashMap<>();

}
