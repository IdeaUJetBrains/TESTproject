package idea99721.hbmfiles;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 7/8/2016.
 */
@Entity
public class Personphone99791 {
    private Integer personId;
    private int phoneId;
    private Integer phonenummer;
    private Person99791 person99791ByPersonId;

    @Basic
    @Column(name = "PERSON_ID", nullable = true)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "PHONE_ID", nullable = false)
    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    @Basic
    @Column(name = "PHONENUMMER", nullable = true)
    public Integer getPhonenummer() {
        return phonenummer;
    }

    public void setPhonenummer(Integer phonenummer) {
        this.phonenummer = phonenummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personphone99791 that = (Personphone99791) o;

        if (phoneId != that.phoneId) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (phonenummer != null ? !phonenummer.equals(that.phonenummer) : that.phonenummer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + phoneId;
        result = 31 * result + (phonenummer != null ? phonenummer.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "ID")
    public Person99791 getPerson99791ByPersonId() {
        return person99791ByPersonId;
    }

    public void setPerson99791ByPersonId(Person99791 person99791ByPersonId) {
        this.person99791ByPersonId = person99791ByPersonId;
    }
}
