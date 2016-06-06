import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "IDEA79247")
public class IDEA79247 extends BaseEntity implements Serializable {

    @Id
    private int id;

    @Column(name = "TESTCHAR", nullable = true)
    @Type(type = JaNeeType.NAME)
    private Boolean testchar;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getTestchar() {
        return testchar;
    }

    public void setTestchar(Boolean teststr) {
        this.testchar = teststr;
    }

}
