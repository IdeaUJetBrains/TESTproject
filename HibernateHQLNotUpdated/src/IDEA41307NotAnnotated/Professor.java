package IDEA41307NotAnnotated;


import java.util.Arrays;

public class Professor {
    private int id;
    private String name;
    private byte[] salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public byte[] getSalary() {
        return salary;
    }

    public void setSalary(byte[] salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Professor professor = (Professor) o;

        if (id != professor.id) return false;
        if (name != null ? !name.equals(professor.name) : professor.name != null) return false;
        if (!Arrays.equals(salary, professor.salary)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(salary);
        return result;
    }
}
