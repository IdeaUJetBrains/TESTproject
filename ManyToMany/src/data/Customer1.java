package data;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/4/2015.
 */
@Entity
@Table(name = "CUSTOMER", schema = "PUBLIC", catalog = "PUBLIC")
public class  Customer1 {
    private int id;
    private String customer;
    private Collection<Order1> oredrIDs;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CUSTOMER", nullable = true, length = 255)
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer1 customer1 = (Customer1) o;

        if (id != customer1.id) return false;
        if (customer != null ? !customer.equals(customer1.customer) : customer1.customer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
    }

    @ManyToMany
    @JoinTable(name = "CUSTOMERORDER", catalog = "PUBLIC", schema = "PUBLIC", joinColumns = @JoinColumn(name = "CUSTOMERID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ORDERID", referencedColumnName = "ID"))
    public Collection<Order1> getOredrIDs() {
        return oredrIDs;
    }

    public void setOredrIDs(Collection<Order1> oredrIDs) {
        this.oredrIDs = oredrIDs;
    }
}
