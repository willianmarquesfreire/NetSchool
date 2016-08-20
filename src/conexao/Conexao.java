package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wmfsystem
 */
public class Conexao {

    private static final String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    private static final String URL = "jdbc:derby://localhost:1527/netschool";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Conexao factory;
    private Connection conn;

    private Conexao() {
        createConnection();
    }

    private void createConnection() {
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Conexao newInstance() {
        if (factory == null) {
            factory = new Conexao();
        }
        return factory;
    }

    public Connection getConn() {
        return conn;
    }

}
