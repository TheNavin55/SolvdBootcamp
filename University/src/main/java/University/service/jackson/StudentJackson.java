package University.service.jackson;

import University.bin.studentrelated.Student;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentJackson implements JacksonService{
    private static final Logger LOGGER = LogManager.getLogger(StudentJackson.class);

    @Override
    public List<Student> serializedEntity(String path) {
        ObjectMapper om = new ObjectMapper();
        try{
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, Student.class);
            return om.readValue(new File(path), type);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.info("There was an error while des serializing the client", e);
            throw new RuntimeException(e);
        }
    }
}
