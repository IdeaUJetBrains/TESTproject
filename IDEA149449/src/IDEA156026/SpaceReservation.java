package IDEA156026;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "IDEA156026")
public class SpaceReservation implements Serializable {
    //private static final long serialVersionUID = 12358903454875L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /*@Column(name = "token", nullable = false, unique = true)
    private String reservationToken;*/

    @Column(name = "DATE", nullable = false)
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

    //...
}
