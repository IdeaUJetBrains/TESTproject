import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyClass implements MyInterface {
    @Id
    int id;
    public int getId() { return id; }
    public void setId(int value) { this.id = value; }


    int value;
    @Basic
    @Column
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
}