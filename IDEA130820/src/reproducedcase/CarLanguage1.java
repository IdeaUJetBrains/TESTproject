package reproducedcase;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 7/6/2016.
 */
@Entity
@Table(name = "CAR_LANGUAGE1", schema = "PUBLIC", catalog = "PUBLIC")
public class CarLanguage1 {
    /*private int aId;
    private int bId;
    private CarDe carDeByAId;
    private CarRu carRuByBId;*/

    protected CarLanguage1() {  }
    public CarLanguage1(CarDe carDe, CarRu carRu) {
        id = new CarLanguage1PK(carDe, carRu);
    }

    @EmbeddedId
    private CarLanguage1PK id;
    private CarLanguage1PK getId() {
        return id;
    }



    @Embeddable
    public static class CarLanguage1PK implements Serializable {

        public CarLanguage1PK() { }

        public CarLanguage1PK(CarDe carDe, CarRu carRu) {
            this.carDe = carDe;
            this.carRu = carRu;
        }


        @ManyToOne
        @JoinColumn(name = "A_ID", referencedColumnName = "CAR_DE_ID", nullable = false)
        private CarDe carDe;
        public CarDe getCarDeByAId() {
            return carDe;
        }
        public void setCarDeByAId(CarDe carDeByAId) { this.carDe = carDe;       }


        @ManyToOne
        @JoinColumn(name = "B_ID", referencedColumnName = "CAR_RU_ID", nullable = false)
        private CarRu carRu;
        public CarRu getCarRuByBId() {
            return carRu;
        }
        public void setCarRuByBId(CarRu carRuByBId) {  this.carRu = carRu; }

        /*private int aId;
        private int bId;

        @Column(name = "A_ID", nullable = false)
        @Id
        public int getaId() {
            return aId;
        }

        public void setaId(int aId) {
            this.aId = aId;
        }

        @Column(name = "B_ID", nullable = false)
        @Id
        public int getbId() {
            return bId;
        }

        public void setbId(int bId) {
            this.bId = bId;
        }
*/
        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }
            if (!(o instanceof CarLanguage1.CarLanguage1PK)) {
                return false;
            }
            CarLanguage1.CarLanguage1PK other = (CarLanguage1.CarLanguage1PK) o;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(getCarDeByAId(), other.getCarDeByAId());
            builder.append(getCarRuByBId(), other.getCarRuByBId());
            return builder.isEquals();
        }

        @Override
        public int hashCode() {
            HashCodeBuilder builder = new HashCodeBuilder();
            builder.append(getCarDeByAId());
            builder.append(getCarRuByBId());
            return builder.toHashCode();

        }
    }

   /* @Id
    @Column(name = "A_ID", nullable = false)
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Id
    @Column(name = "B_ID", nullable = false)
    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }*/


    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLanguage1)) {
            return false;
        }

        CarLanguage1 other = (CarLanguage1) obj;
        return getId().equals(other.getId());
    }
}
