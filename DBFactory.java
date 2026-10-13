interface DBFactory {
    DBConnection createConnection();
    DBRepository createRepository();
}