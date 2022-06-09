package University.bin.studentrelated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Intership {
    @JsonProperty
    private long id;
    @JsonProperty
    private String name;

    public Intership() {
    }

    public Intership(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intership)) return false;
        Intership intership = (Intership) o;
        return getId() == intership.getId() && Objects.equals(getName(), intership.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Intership{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
