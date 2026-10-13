

class PostgreSQLConnection implements DBConnection {
    @Override 
    public void connect() {
        System.out.println("Conectando ao PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando do PostgreSQL");
    }
}