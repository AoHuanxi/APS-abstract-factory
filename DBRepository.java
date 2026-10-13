interface DBRepository {
    void save(Object data);
    Object findById(int id);
}