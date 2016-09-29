import javax.persistence.*;
import java.io.Serializable;
import java.time.Period;

@Entity
@Table(name = "table_name_interval")
public class TestIntervalAsPeriod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "v_interval", nullable = false)
    private Period dateRequested;

    public Period getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Period dateRequested) {
        this.dateRequested = dateRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
