import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "table_name_time_tz")
public class TimeTZTest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "v_time_with_time_zone", nullable = false)
    private Time dateRequested;

    public Time getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Time dateRequested) {
        this.dateRequested = dateRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
