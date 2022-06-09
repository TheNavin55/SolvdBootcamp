package University.bin.studentrelated;

import University.bin.staff.Teacher;

import java.util.List;

public class Asignature {
    private long id;
    private String asignature;
    private List<Teacher> teachers;
    private List<Student> students;


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

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
