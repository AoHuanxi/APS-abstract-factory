

public class SQLServerFactory implements DBFactory {

    private final SQLServerConnection connection =
        new SQLServerConnection();

    @Override
    public DBConnection createConnection() {
        return new SQLServerConnection();
    }

    @Override
    public DBRepository createRepository() {
        return new SQLServerRepository(connection);
    }
}