package withoutInheritance;

import org.hibernate.annotations.AccessType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Entity
@MappedSuperclass
@AccessType(value ="property")
//@AccessType("field")
public abstract class BaseEntity implements Serializable {

    //todo bug IDEA-43174.1
    public abstract Serializable getId1();

    //todo bug IDEA-43174.1 the same error, but it's correct
    private int test1;
    public int getTest1() {  return this.id2;  }



    //todo while my setter is in super class
    int id2;
    public int getId2() {  return this.id2;  }


    @AccessType("field")
    public int test2;
    public int getTest2() {  return this.test2;  }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}