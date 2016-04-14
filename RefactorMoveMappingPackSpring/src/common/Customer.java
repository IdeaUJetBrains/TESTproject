package common;

public class Customer {

    String name;
    int age;
    boolean flag;
    String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFlag(boolean flag) {

        this.flag = flag;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public boolean isFlag() {

        return flag;
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }
}