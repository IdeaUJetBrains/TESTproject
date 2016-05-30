package test;

import javax.lang.model.element.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_CARD")
public class CreditCardPayment extends Payment {
    @Column(name = "CREDITCARDTYPE")
    private String creditCardType;

    public CreditCardPayment(String c, double amount) {
        this.setAmount(amount);
        this.setCreditCardType(c);
    }

    public CreditCardPayment() {
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
}