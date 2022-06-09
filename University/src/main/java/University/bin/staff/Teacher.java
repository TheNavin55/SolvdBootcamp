package University.bin.staff;

import javax.xml.bind.annotation.*;
import java.util.Objects;

@XmlRootElement (name= "teacher")
@XmlAccessorType(XmlAccessType.FIELD)
public class Teacher {
    @XmlAttribute(name="id")
    private long id;
    @XmlElement(name="fname")
    private String firstname;
    @XmlElement(name="lname")
    private String lastname;
    @XmlElement(name="age")
    private int age;


    public Teacher(long id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Teacher() {
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
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() && getAge() == teacher.getAge() && Objects.equals(getFirstname(), teacher.getFirstname()) && Objects.equals(getLastname(), teacher.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastname(), getAge());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
