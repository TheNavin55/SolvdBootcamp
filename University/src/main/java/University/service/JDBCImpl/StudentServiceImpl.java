package University.service.JDBCImpl;

import University.DAO.IStudentDAO;
import University.DAO.Impl.StudentDAO;
import University.service.StudentService;
import University.bin.studentrelated.Student;

public class StudentServiceImpl implements StudentService{
    @Override
    public Student getStudent(long id){
        IStudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getEntityById(id);
        return student;
    }

    @Override
    public void saveStudent(Student student) {
        IStudentDAO studentDAO = new StudentDAO();
        studentDAO.saveEntity(student);
    }

    @Override
    public void updateStudent(Student student) {
        IStudentDAO studentDAO = new StudentDAO();
        studentDAO.updateEntity(student);
    }

    @Override
    public Student deleteStudent(long id) {
        IStudentDAO studentDAO = new StudentDAO();
        studentDAO.removeEntity(id);
        return null;
    }
}
