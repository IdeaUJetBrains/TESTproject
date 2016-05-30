package test;

import javax.persistence.*;

//@Table(name = "CREDIT_CARD")
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Payment {
    @Id
    //@SequenceGenerator( name="SEQ_GEN", sequenceName="hibernate_sequence", allocationSize=1 )
    //@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_GEN")
    @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name = "PAYMENT_ID", nullable = false)
    private int id;
    public int getId() {
        return id;
    }
    @Column(name = "AMOUNT", nullable = false)
    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
