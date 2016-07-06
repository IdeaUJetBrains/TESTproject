package reproducedcase;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/6/2016.
 */
@Entity
@Table(name = "CAR_DE", schema = "PUBLIC", catalog = "PUBLIC")
public class CarDe {
    private int carDeId;
    private Collection<CarLanguage1> carLanguage1sByCarDeId;

    @Id
    @Column(name = "CAR_DE_ID", nullable = false)
    public int getCarDeId() {
        return carDeId;
    }

    public void setCarDeId(int carDeId) {
        this.carDeId = carDeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarDe carDe = (CarDe) o;

        if (carDeId != carDe.carDeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return carDeId;
    }

    @OneToMany(mappedBy = "carDeByAId")
    public Collection<CarLanguage1> getCarLanguage1sByCarDeId() {
        return carLanguage1sByCarDeId;
    }

    public void setCarLanguage1sByCarDeId(Collection<CarLanguage1> carLanguage1sByCarDeId) {
        this.carLanguage1sByCarDeId = carLanguage1sByCarDeId;
    }
}
