package University.DAO.Impl;

import University.util.ConnectionPool;

import java.sql.Connection;

public class AbstractDAO {
    public Connection getConnection(){
        return ConnectionPool.getInstance().getConnection();
    }
    void returnConnection(Connection connection){
        ConnectionPool.getInstance().returnConnection(connection);
    }
}
