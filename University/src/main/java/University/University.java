package University;

import University.bin.staff.Dean;
import University.bin.staff.Teacher;
import University.service.JDBCImpl.DeanServiceImpl;
import University.service.JDBCImpl.StudentServiceImpl;
import University.bin.studentrelated.Student;
import University.service.jackson.StudentJackson;
import University.service.jaxB.TeacherJaxB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public class University {
    private final static Logger LOGGER = LogManager.getLogger(University.class);

    public static void main(String[] args) throws IOException, JAXBException {

        //JDBC
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student student = studentService.getStudent(1);
        LOGGER.info(student);

        StudentServiceImpl studentService1 = new StudentServiceImpl();
        Student student2 = studentService1.deleteStudent(1);
        LOGGER.info(student2);


        //JaxB
        TeacherJaxB teacherJaxB = new TeacherJaxB();
        Teacher teacher = (Teacher) teacherJaxB.unmarshall("src/main/resources/teacher.xml");
        LOGGER.info(teacher);

        TeacherJaxB teacherJaxB1 = new TeacherJaxB();
        Teacher teacher1 = new Teacher(2,"Brian","Schulz",50);
        teacherJaxB1.marshall(teacher1, "src/main/resources/teacher2.xml");

        //Jackson
        StudentJackson studentJackson = new StudentJackson();
        List student1 = studentJackson.serializedEntity("src/main/resources/students.json");
        LOGGER.info(student1);

        //MyBatis
        DeanServiceImpl deanService = new DeanServiceImpl();
        Dean dean = deanService.getDean(1);
        LOGGER.info(dean);
    }
}
