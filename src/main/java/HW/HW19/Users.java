package HW.HW19;

import java.util.Objects;

public class Users implements Cloneable {

    private String userName;
    private int age;

    public Users(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(userName, users.userName);
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
