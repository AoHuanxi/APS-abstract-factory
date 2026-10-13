public class Main {
    public static void main(String[] args) {
        DBFactory factory = new PostgreSQLFactory();
        // DBFactory factory = new SQLServerFactory();

        DBConnection connection = factory.createConnection();
        DBRepository repository = factory.createRepository();

        connection.connect();

        try {
            repository.save("Ana");

            Object user = repository.findById(1);
            System.out.println("Usuário encontrado: " + user);
        } finally {
            connection.disconnect();
        }
    }
}