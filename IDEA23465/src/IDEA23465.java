import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IDEA23465 {
    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum TestEnum2 {
        val1,
        val2
    }

}
