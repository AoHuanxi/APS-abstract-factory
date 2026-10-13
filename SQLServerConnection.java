class SQLServerConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Conectando ao SQL Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando do SQL Server");
    }
}
