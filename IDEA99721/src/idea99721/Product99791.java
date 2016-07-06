package idea99721;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 7/5/2016.
 */
@Entity
public class Product99791 {
    private int productId;
    private Integer parts;
    private Productpart99721 productpart99721ByParts;

    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "PARTS", nullable = true)
    public Integer getParts() {
        return parts;
    }

    public void setParts(Integer parts) {
        this.parts = parts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product99791 that = (Product99791) o;

        if (productId != that.productId) return false;
        if (parts != null ? !parts.equals(that.parts) : that.parts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (parts != null ? parts.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PARTS", referencedColumnName = "PART_ID")
    public Productpart99721 getProductpart99721ByParts() {
        return productpart99721ByParts;
    }

    public void setProductpart99721ByParts(Productpart99721 productpart99721ByParts) {
        this.productpart99721ByParts = productpart99721ByParts;
    }
}
