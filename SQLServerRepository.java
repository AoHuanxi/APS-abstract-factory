class SQLServerRepository implements DBRepository {
    @Override
    public void save(Object data) {
        System.out.println("Salvando dados no SQL Server");
    }

    @Override
    public Object findById(int id) {
        System.out.println("Buscando dados no SQL Server: " + id);
        return null;
    }
}