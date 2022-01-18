package memorygamenikola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection conn = null;
    private String url = "jdbc:mysql://localhost:3306/igra";
    private String user = "root";
    private String password = "root";
    private static DBConnection instance = null;

    DBConnection() throws SQLException {
        conn = DriverManager.getConnection(url, user, password);
    }

    public static Connection getConn() throws SQLException {
        if (instance == null) 
        instance = new DBConnection();      
        return instance.conn;
    }

}
