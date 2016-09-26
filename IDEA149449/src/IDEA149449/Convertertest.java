package IDEA149449;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Olga Pavlova on 6/1/2016.
 */
@Entity
@Table(name = "convertertest")
public class Convertertest {
    private int id;
    private Timestamp timetest;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TIMETEST", nullable = true)
    @Convert(converter = LocalDateTimeConverter.class)
    public Timestamp getTimetest() {
        return timetest;
    }

    public void setTimetest(Timestamp timetest) {
        this.timetest = timetest;
    }


}
