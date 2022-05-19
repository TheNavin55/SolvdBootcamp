package University.generalpurpose;

public class Speciality {
    private long id;
    private String speciality;

    public Speciality(long id, String speciality) {
        this.id = id;
        this.speciality = speciality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
