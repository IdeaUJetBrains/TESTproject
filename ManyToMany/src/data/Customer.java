package data;

import dataJoinTable.Test;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
public class Customer {
    private int id;
    private String customer;

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

        Customer customer1 = (Customer) o;

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


    private Collection<Order> orderIds;
    @ManyToMany
    @JoinTable(name = "CUSTOMERORDER",
            joinColumns = {@JoinColumn(name = "ORDERID", referencedColumnName="ID")},
            inverseJoinColumns = {@JoinColumn(name = "CUSTOMERID", referencedColumnName="ID")} )
    public Collection<Order> getOrderIds() { return orderIds; }

}
