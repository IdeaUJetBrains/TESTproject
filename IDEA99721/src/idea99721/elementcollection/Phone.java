package idea99721.elementcollection;

import idea99721.newpackage.Person99791;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 7/8/2016.
 */
@Embeddable
//@Table(name = "PERSONPHONE99721")
public class Phone {
    private Integer personId;
    private int phoneId;
    private Integer phonenummer;
    private idea99721.newpackage.Person99791 personByPersonId;

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

        Phone that = (Phone) o;

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


    /*@ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "ID")
    public idea99721.hbmfiles.Person99791 getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person99791 person99791ByPersonId) {
        this.personByPersonId = person99791ByPersonId;
    }*/
}
