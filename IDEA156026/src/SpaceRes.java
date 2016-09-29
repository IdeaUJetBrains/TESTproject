

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@javax.persistence.Table(name = "IDEA156026")
public class SpaceRes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "date", nullable = false)
    private ZonedDateTime dateRequested;

    public ZonedDateTime getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(ZonedDateTime dateRequested) {
        this.dateRequested = dateRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
