public class PostgreSQLFactory implements DBFactory {

    private final PostgreSQLConnection connection =
        new PostgreSQLConnection();

    @Override
    public DBConnection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public DBRepository createRepository() {
        return new PostgreSQLRepository(connection);
    }
}