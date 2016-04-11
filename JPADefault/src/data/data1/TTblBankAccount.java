package data.data1;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 4/1/2016.
 */
@Entity
@Table(name = "TBL_BANK_ACCOUNT", schema = "PUBLIC", catalog = "PUBLIC")
public class TTblBankAccount {
    private String accountnumber;
    private Double amount;

    @Id
    @Column(name = "ACCOUNTNUMBER", nullable = false, length = 255)
    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Basic
    @Column(name = "AMOUNT", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTblBankAccount that = (TTblBankAccount) o;

        if (accountnumber != null ? !accountnumber.equals(that.accountnumber) : that.accountnumber != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountnumber != null ? accountnumber.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
