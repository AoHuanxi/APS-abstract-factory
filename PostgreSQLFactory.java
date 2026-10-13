class PostgreSQLFactory implements DBFactory {

    @Override
    public DBConnection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public DBRepository createRepository() {
        return new PostgreSQLRepository();
    }
}