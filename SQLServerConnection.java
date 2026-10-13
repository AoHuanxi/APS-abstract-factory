import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection implements DBConnection {
    private Connection connection;

    @Override
    public Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url =
                "jdbc:sqlserver://localhost:1433;"
                + "databaseName=meubanco;"
                + "encrypt=true;"
                + "trustServerCertificate=true";

            String user = "sa";
            String password = "sua_senha";

            connection = DriverManager.getConnection(
                url, user, password
            );
        }

        return connection;
    }

    @Override
    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            connection = null;
        }
    }
}