package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
    @Id
    private int id;
    private String name;
    private long salary;

    public Professor() {}
    public Professor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        //return (this.name == null) ? "UNKNOWN" : name;
        return this.name;
    }

    public void setName(String name) {
        if(name == null) //We set default value in case if the value is not set yet.
            this.name = "UNKNOWN";
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Professor id: " + getId() + " name: " + getName() + " salary: " + getSalary();
    }
}
