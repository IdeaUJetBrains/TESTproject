package entities;

import javax.persistence.*;

@Entity
@Table(name = "IDEA132472ENTITY")
public class Idea1 {

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
