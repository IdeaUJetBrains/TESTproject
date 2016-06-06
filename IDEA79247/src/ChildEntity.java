import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "IDEA79247")
public class ChildEntity extends BaseEntity implements Serializable {

    @Id
    private int id;

    @Column(name = "TESTCHAR", nullable = true)
    @Type(type = "typeDefName")
    private String teststr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeststr() {

        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr;
    }



}
