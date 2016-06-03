package IDEA155378;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**TODO runs with the exception in Hibernate console:
 *SELECT Publication FROM Testidea15537 AS c WHERE c.enamelId = 323 ORDER BY c.publication.year
 *TODO runs OK:
 *SELECT c.publication FROM Testidea15537 AS c WHERE c.enamelId = 323 ORDER BY c.publication.year
*/
@Entity
public class Testidea15537 {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Integer pubId;

    @Basic
    @javax.persistence.Column(name = "PUB_ID", nullable = true, insertable=false, updatable=false)
    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    private Integer enamelId;

    @Basic
    @javax.persistence.Column(name = "PIECE_AKA", nullable = true, insertable=false, updatable=false)
    public Integer getEnamelId() {
        return enamelId;
    }

    public void setEnamelId(Integer pieceAka) {
        this.enamelId = pieceAka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Testidea15537 that = (Testidea15537) o;

        if (id != that.id) return false;
        if (pubId != null ? !pubId.equals(that.pubId) : that.pubId != null) return false;
        if (enamelId != null ? !enamelId.equals(that.enamelId) : that.enamelId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pubId != null ? pubId.hashCode() : 0);
        result = 31 * result + (enamelId != null ? enamelId.hashCode() : 0);
        return result;
    }

    private Publication publication;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "PUB_ID", referencedColumnName = "ID")
    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publicationByPubId) {
        this.publication = publicationByPubId;
    }

    private Enamel enamel;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "PIECE_AKA", referencedColumnName = "ID")
    public Enamel getEnamel() {
        return enamel;
    }

    public void setEnamel(Enamel enamelByPieceAka) {
        this.enamel = enamelByPieceAka;
    }
}
