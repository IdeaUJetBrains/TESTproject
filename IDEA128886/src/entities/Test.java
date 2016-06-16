package entities;

import javax.persistence.*;

@Entity
@Table(name = "IDEA128886")
public class Test {

    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    @Basic
    @Column(name = "TEST")
    private int test;

}
