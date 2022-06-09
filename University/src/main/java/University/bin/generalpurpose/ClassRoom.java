package University.bin.generalpurpose;

import java.util.Objects;

public class ClassRoom {
    private long id;
    private String name;

    public ClassRoom(long id, String name) {
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
        if (!(o instanceof ClassRoom)) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return getId() == classRoom.getId() && Objects.equals(getName(), classRoom.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
