package University.service;

import University.bin.studentrelated.Student;

public interface StudentService {
    Student getStudent(long id);
    void saveStudent(Student student);
    void updateStudent(Student student);
    Student deleteStudent(long id);
}
