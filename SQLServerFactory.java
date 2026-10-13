

class SQLServerFactory implements DBFactory {

    @Override
    public DBConnection createConnection() {
        return new SQLServerConnection();
    }

    @Override
    public DBRepository createRepository() {
        return new SQLServerRepository();
    }
}