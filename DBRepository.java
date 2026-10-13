import java.sql.SQLException;

public interface DBRepository {
    int save(String name) throws SQLException;
    String findById(int id) throws SQLException;
}