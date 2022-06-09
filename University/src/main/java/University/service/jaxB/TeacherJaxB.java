package University.service.jaxB;

import University.bin.staff.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class TeacherJaxB implements JaxbService<Teacher> {
    private static final Logger LOGGER = LogManager.getLogger(TeacherJaxB.class);

    @Override
    public Object unmarshall(String xmlFilePath) {
        File xmlFile = new File(xmlFilePath);
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Teacher.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Teacher) unmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            LOGGER.error("There was an error with jaxb library", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void marshall(Teacher object, String xmlResultPath) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Teacher.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(object, new File(xmlResultPath));
        } catch (JAXBException e) {
            LOGGER.error("There was an error with jaxb library", e);
        }
    }
}
