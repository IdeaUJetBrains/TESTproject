import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "table_name_time")
public class TestTimeAsLocalTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "v_time", nullable = false)
    private LocalTime dateRequested;

    public LocalTime getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(LocalTime dateRequested) {
        this.dateRequested = dateRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
