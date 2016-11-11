import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    public int i;

    public String foo(){
        return "foo";
    }
}
