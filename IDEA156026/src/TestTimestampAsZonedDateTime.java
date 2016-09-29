import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "table_name_timestamp_tz")
public class TestTimestampAsZonedDateTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "v_timestamp_with_time_zone", nullable = false)
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
