package idea99721;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 7/5/2016.
 */
@Entity
public class Productpart99721 {
    private int partId;
    private Collection<Product99791> product99791sByPartId;

    @Id
    @Column(name = "PART_ID", nullable = false)
    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Productpart99721 that = (Productpart99721) o;

        if (partId != that.partId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return partId;
    }

    @OneToMany(mappedBy = "productpart99721ByParts")
    public Collection<Product99791> getProduct99791sByPartId() {
        return product99791sByPartId;
    }

    public void setProduct99791sByPartId(Collection<Product99791> product99791sByPartId) {
        this.product99791sByPartId = product99791sByPartId;
    }
}
