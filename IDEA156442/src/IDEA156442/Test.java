package IDEA156442;

import javax.persistence.*;
import java.sql.Date;


/**
 * Created by Olga Pavlova on 6/1/2016.
 */
@Entity
@Table(name = "test")
public class Test {
    private int someId;
    private String someText;
    private Date someDate;

    @Id
    @Column(name = "some_id", nullable = false)
    public int getSomeId() {
        return someId;
    }

    public void setSomeId(int someId) {
        this.someId = someId;
    }

    @Basic
    @Column(name = "some_text", nullable = true, length = -1)
    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (someId != test.someId) return false;
        if (someText != null ? !someText.equals(test.someText) : test.someText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = someId;
        result = 31 * result + (someText != null ? someText.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "some_date")
    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }
}
