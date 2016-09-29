import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "table_name_timestamp")
public class TestTimestampAsInstant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "v_timestamp", nullable = false)
    private Instant dateRequested;

    public Instant getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Instant dateRequested) {
        this.dateRequested = dateRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
