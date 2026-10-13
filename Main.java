import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DBFactory factory = new PostgreSQLFactory();

        DBConnection connection = factory.createConnection();
        DBRepository repository = factory.createRepository();

        try {
            int id = repository.save("Ana");
            System.out.println("Usuário cadastrado: " + id);

            String name = repository.findById(id);
            System.out.println("Nome encontrado: " + name);
        } catch (SQLException e) {
            System.err.println("Erro no banco: " + e.getMessage());
        } finally {
            try {
                connection.disconnect();
            } catch (SQLException e) {
                System.err.println(
                    "Erro ao encerrar conexão: " + e.getMessage()
                );
            }
        }
    }
}