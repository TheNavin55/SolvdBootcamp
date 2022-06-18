package University.DAO.Impl;

import University.DAO.IStudentDAO;
import University.bin.studentrelated.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDAO extends AbstractDAO implements IStudentDAO {
    private final static Logger LOGGER = LogManager.getLogger(StudentDAO.class);
    private final static String INSERT = "INSERT INTO Students (firstname, lastname, age) VALUES (?,?,?) WHERE id=?";
    private final static String UPDATE = "UPDATE Students SET firstname=?,lastname=?,age=? WHERE id=?";
    private final static String SELECT = "SELECT * FROM Students WHERE id=?";
    private final static String DELETE = "DELETE FROM Students WHERE id=?";

    @Override
    public Student getEntityById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try{
            pr = con.prepareStatement(SELECT);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            Student student = new Student();
            rs.next();
            student.setId(Integer.parseInt(rs.getString("id")));
            student.setFirstname(rs.getString("firstName"));
            student.setLastname(rs.getString("lastName"));
            student.setAge(Integer.parseInt(rs.getString("age")));

            return student;
        } catch (SQLException e) {
            LOGGER.error("There was a problem while doing the statement");
            throw new RuntimeException(e);
        }
        finally {
            returnConnection(con);
            try {
                if (pr != null)
                    pr.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                LOGGER.error("Exception while closing resources", e);
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void saveEntity(Student entity) {
        PreparedStatement pr = null;
        Connection con = getConnection();


        try{
            pr = con.prepareStatement(INSERT);
            pr.setString(1, entity.getFirstname());
            pr.setString(2, entity.getLastname());
            pr.setInt(3 , entity.getAge());
            pr.setLong(4, entity.getId());
            pr.execute();
        } catch (SQLException e) {
            LOGGER.error("There was a problem while doing the statement");
            throw new RuntimeException(e);
        }
        finally {
            returnConnection(con);
        }
        try {
            if (pr != null)
                pr.close();
        } catch (SQLException e) {
            LOGGER.error("Exception while closing", e);
            throw new RuntimeException(e);
        }
    }


    @Override
    public void updateEntity(Student entity){
        PreparedStatement pr = null;
        Connection con = getConnection();


        try{
            pr = con.prepareStatement(UPDATE);
            pr.setString(1, entity.getFirstname());
            pr.setString(2, entity.getLastname());
            pr.setInt(3 , entity.getAge());
            pr.setLong(4, entity.getId());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("There was a problem while doing the statement", e);
            throw new RuntimeException(e);
        }
        finally {
            returnConnection(con);
        }
        try{
            if (pr != null){
                pr.close();
            }
        } catch (SQLException e) {
            LOGGER.error("Exception while closing", e);
            throw new RuntimeException();
        }
    }

    @Override
    public void removeEntity(long id) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try{
            pr = con.prepareStatement(DELETE);
            pr.setLong(1, id);
            pr.execute();
        } catch (SQLException e) {
            LOGGER.error("There was a problem while doing the statement", e);
            throw new RuntimeException(e);
        }
        finally {
            returnConnection(con);
        }
        try{
            if (pr != null){
                pr.close();
            }
        } catch (SQLException e) {
            LOGGER.error("Exception while closing", e);
            throw new RuntimeException();
        }
    }
}
