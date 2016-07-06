package reproducedcase;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/6/2016.
 */
@Entity
@Table(name = "CAR_RU", schema = "PUBLIC", catalog = "PUBLIC")
public class CarRu {
    private int carRuId;
    private Collection<CarLanguage1> carLanguage1sByCarRuId;

    @Id
    @Column(name = "CAR_RU_ID", nullable = false)
    public int getCarRuId() {
        return carRuId;
    }

    public void setCarRuId(int carRuId) {
        this.carRuId = carRuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarRu carRu = (CarRu) o;

        if (carRuId != carRu.carRuId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return carRuId;
    }

    @OneToMany(mappedBy = "carRuByBId")
    public Collection<CarLanguage1> getCarLanguage1sByCarRuId() {
        return carLanguage1sByCarRuId;
    }

    public void setCarLanguage1sByCarRuId(Collection<CarLanguage1> carLanguage1sByCarRuId) {
        this.carLanguage1sByCarRuId = carLanguage1sByCarRuId;
    }
}
