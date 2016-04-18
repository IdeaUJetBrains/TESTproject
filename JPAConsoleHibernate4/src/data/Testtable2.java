package data;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 10/22/2015.
 */
/*@NamedNativeQueries({
        @NamedNativeQuery(name = "FRX_PARENTERALIA.FIND_EXISTING_PARENTERALIA",
                query = " select parenteralia.id, parenteralia.jjjj, parenteralia.APOIK, " +
                        "        parenteralia.TRANSAKTIONS_NUMMER,   parenteralia.STATUS, " +
                        "        parenteralia.FIVERX_STATUSs,SCALE DATA ss parenteralia.XML.XMLDATA as parenteralia.xml," +
                        "        parenteralia.REQUEST_ID,CHARACTER_SET_SCHEMA SQLCODE eingang.APOTHEKEN_IK " +
                        " from FRX_PARENTERALIA parenteralia,as xxczsdas ddd FIVERXs_EINGANG eingang " +
                        " where (parenteralia.APOIK = ? " +"ssda"+"ds"+"d"+
                        "    or eingang.APOTHEKEN_IK = ?) (d)" + "ddf" + "dsds"+
                        "   and parenteralia.JJJJ = ? " +
                        "   and parenteralia.TRANSAKTIONS_NUMMER = ? " +
                        "   and eingang.REQUEST_ID = parenteralia.REQUEST_ID " +
                        "   and eingang.VERSION like '2.%' ",
                resultSetMapping = "FRX_PARENTERALIA.MAPPER"
        )
})*/
@Entity
@Table(name = "TESTTABLE", schema = "PUBLIC", catalog = "PUBLIC")
public class Testtable2 {
    private int id;
    private String firstname;
    private String lastname;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 255)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 255)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Testtable2 that = (Testtable2) o;

        if (id != that.id) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
