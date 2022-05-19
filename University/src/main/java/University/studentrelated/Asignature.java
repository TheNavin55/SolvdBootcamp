package University.studentrelated;

public class Asignature {
    private long id;
    private String asignature;

    public Asignature(long id, String asignature) {
        this.id = id;
        this.asignature = asignature;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAsignature() {
        return asignature;
    }

    public void setAsignature(String asignature) {
        this.asignature = asignature;
    }
}
