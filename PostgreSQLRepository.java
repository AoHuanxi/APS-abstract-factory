class PostgreSQLRepository implements DBRepository {
    @Override
    public void save(Object data) {
        System.out.println("Salvando dados no PostgreSQL");
    }

    @Override
    public Object findById(int id) {
        System.out.println("Buscando dados no PostgreSQL: " + id);
        return null;
    }
}