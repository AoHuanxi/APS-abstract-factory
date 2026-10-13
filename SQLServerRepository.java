import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLServerRepository implements DBRepository {
    private final DBConnection dbConnection;

    public SQLServerRepository(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public int save(String name) throws SQLException {
        String sql =
            "INSERT INTO users (name) OUTPUT INSERTED.id VALUES (?)";

        Connection connection = dbConnection.connect();

        try (PreparedStatement statement =
                 connection.prepareStatement(sql)) {

            statement.setString(1, name);

            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    return result.getInt("id");
                }

                throw new SQLException("Não foi possível obter o ID.");
            }
        }
    }

    @Override
    public String findById(int id) throws SQLException {
        String sql = "SELECT name FROM users WHERE id = ?";

        Connection connection = dbConnection.connect();

        try (PreparedStatement statement =
                 connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet result = statement.executeQuery()) {
                return result.next() ? result.getString("name") : null;
            }
        }
    }
}