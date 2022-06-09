package University.bin.studentrelated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Student {
    @JsonProperty("id")
    private long id;
    @JsonProperty("fname")
    private String firstname;
    @JsonProperty("lname")
    private String lastname;
    @JsonProperty("age")
    private int age;
    @JsonProperty
    private Residence residence;
    @JsonProperty
    private Intership intership;
    @JsonProperty
    private Grant grant;
    @JsonProperty
    private Exchange exchange;

    public Student() {
    }

    public Student(long id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Student(long id, String firstname, String lastname, int age, Residence residence, Intership intership, Grant grant, Exchange exchange) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.residence = residence;
        this.intership = intership;
        this.grant = grant;
        this.exchange = exchange;
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

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public Intership getIntership() {
        return intership;
    }

    public void setIntership(Intership intership) {
        this.intership = intership;
    }

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getAge() == student.getAge() && Objects.equals(getFirstname(), student.getFirstname()) && Objects.equals(getLastname(), student.getLastname()) && Objects.equals(getResidence(), student.getResidence()) && Objects.equals(getIntership(), student.getIntership()) && Objects.equals(getGrant(), student.getGrant()) && Objects.equals(getExchange(), student.getExchange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastname(), getAge(), getResidence(), getIntership(), getGrant(), getExchange());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", residence=" + residence +
                ", intership=" + intership +
                ", grant=" + grant +
                ", exchange=" + exchange +
                '}';
    }
}
