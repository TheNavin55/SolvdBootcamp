package University.DAO.Impl;

import University.DAO.IDeanDAO;
import University.bin.staff.Dean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeanDAO extends AbstractDAO implements IDeanDAO {
    private final static Logger LOGGER = LogManager.getLogger(DeanDAO.class);
    private final static String INSERT = "INSERT INTO Deans (firstname, lastname, age) VALUES (?,?,?) WHERE id=?";
    private final static String UPDATE = "UPDATE Deans SET firstname=?,lastname=?,age=?, WHERE id=?";
    private final static String SELECT = "SELECT * FROM Deans WHERE id=?";
    private final static String DELETE = "DELETE FROM Deans WHERE id=?";

    @Override
    public Dean getEntityById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try{
            pr = con.prepareStatement(SELECT);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            Dean dean = new Dean();
            rs.next();
            dean.setId(Integer.parseInt(rs.getString("id")));
            dean.setFirstname(rs.getString("firstName"));
            dean.setLastname(rs.getString("lastName"));
            dean.setAge(Integer.parseInt(rs.getString("age")));

            return dean;
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
    public void saveEntity(Dean entity) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        String firstName = entity.getFirstname();
        String lastName = entity.getLastname();
        int age = entity.getAge();

        try{
            pr = con.prepareStatement(INSERT);
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
    public void updateEntity(Dean entity){
        PreparedStatement pr = null;
        Connection con = getConnection();
        String firstName = entity.getFirstname();
        String lastName = entity.getLastname();
        int age = entity.getAge();

        try{
            pr = con.prepareStatement(UPDATE);
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
