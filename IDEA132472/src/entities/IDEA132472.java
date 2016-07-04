package entities;

import javax.persistence.*;

@Entity
//@Table(name = "IDEA132472ENTITY")
public class IDEA132472 {

    int id;
    @Id
    public int getId() { return id; }
    public void setId(int value) { this.id = value; }


    int value;
    @Basic
    @Column
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
}
