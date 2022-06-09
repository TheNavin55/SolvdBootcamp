package University.bin.studentrelated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Residence {
    @JsonProperty
    private long id;
    @JsonProperty
    private String name;

    public Residence() {
    }

    public Residence(long id, String name) {
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
        if (!(o instanceof Residence)) return false;
        Residence residence = (Residence) o;
        return getId() == residence.getId() && Objects.equals(getName(), residence.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Residence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
