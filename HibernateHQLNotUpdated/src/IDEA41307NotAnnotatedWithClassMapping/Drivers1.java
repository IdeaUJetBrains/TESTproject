package IDEA41307NotAnnotatedWithClassMapping;


public class Drivers1 {
    private int id;
    private String buss1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuss1() {
        return buss1;
    }

    public void setBuss1(String buss1) {
        this.buss1 = buss1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers1 drivers1 = (Drivers1) o;

        if (id != drivers1.id) return false;
        if (buss1 != null ? !buss1.equals(drivers1.buss1) : drivers1.buss1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buss1 != null ? buss1.hashCode() : 0);
        return result;
    }
}
