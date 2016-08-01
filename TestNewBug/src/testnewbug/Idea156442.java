package testnewbug;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Olga Pavlova on 7/12/2016.
 */
@Entity
public class Idea156442 {
    private int someId;
    private String someText;
    private Date someDate;

    @Id
    @Column(name = "SOME_ID", nullable = false)
    public int getSomeId() {
        return someId;
    }

    public void setSomeId(int someId) {
        this.someId = someId;
    }

    @Basic
    @Column(name = "SOME_TEXT", nullable = true, length = 255)
    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    @Basic
    @Column(name = "SOME_DATE", nullable = true)
    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idea156442 that = (Idea156442) o;

        if (someId != that.someId) return false;
        if (someText != null ? !someText.equals(that.someText) : that.someText != null) return false;
        if (someDate != null ? !someDate.equals(that.someDate) : that.someDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = someId;
        result = 31 * result + (someText != null ? someText.hashCode() : 0);
        result = 31 * result + (someDate != null ? someDate.hashCode() : 0);
        return result;
    }
}
