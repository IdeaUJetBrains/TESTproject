package data;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/4/2015.
 */
@Entity
@Table(name = "ORDER", schema = "PUBLIC", catalog = "PUBLIC")
public class Order1 {
    private int id;
    private String order;
    private Collection<Customer1> customerIds;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDER", nullable = true, length = 255)
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order1 order1 = (Order1) o;

        if (id != order1.id) return false;
        if (order != null ? !order.equals(order1.order) : order1.order != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "oredrIDs")
    public Collection<Customer1> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(Collection<Customer1> customerIds) {
        this.customerIds = customerIds;
    }
}
