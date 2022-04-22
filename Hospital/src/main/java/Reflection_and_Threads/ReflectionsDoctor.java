package Reflection_and_Threads;

import com.solvd.enums.Specialty;
import com.solvd.staff.Doctor;
import com.solvd.staff.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionsDoctor {
    private static final Logger LOGGER = LogManager.getLogger(ReflectionsDoctor.class);

    public  static void main(String[] args) {

        LOGGER.info("The super class of " + Doctor.class.getSimpleName() + " class is: " + Doctor.class.getSuperclass());

        Class d1 = new Doctor(1, "Alexis", "Cabeza", Specialty.CARD).getClass();
        Method[] m = d1.getMethods();
        Field[] f = d1.getFields();

        LOGGER.info("There are " + m.length + " methods in this class");

        LOGGER.info("There are " + f.length + " fields in this class");
        for(int i=0; i<f.length; i++){
            LOGGER.info(f[i]);
        }

    }
}
