package University.bin.staff;

import java.util.Objects;

public class Dean {
    private long id;
    private String firstname;
    private String lastname;
    private int age;

    public Dean() {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dean)) return false;
        Dean dean = (Dean) o;
        return getId() == dean.getId() && getAge() == dean.getAge() && Objects.equals(getFirstname(), dean.getFirstname()) && Objects.equals(getLastname(), dean.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastname(), getAge());
    }

    @Override
    public String toString() {
        return "Dean{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
