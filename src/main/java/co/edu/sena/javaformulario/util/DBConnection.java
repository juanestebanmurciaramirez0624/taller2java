public  class DBConnection {
    private static final String URL= "jdbc:mysql://aws.connect.psdb.cloud/myapp?sslMode=VERIFY_IDENTITY";
    private static final String USER = "3lb1qbrzmv5ickge6mik";
    private static final String PASS = "pscale_pw_oVmKabKHG1fcCcZ2r0jwWokyGVCes8NN17HLzlmS3YE";
    private static BasicDataSource pool;
}

public static BasicDataSource getInstance () throws SQLException {
    if (pool = null) {
        pool = new BasicDataSource();
        pool.setUrl(URL);
        pool.setUsername(USER);
        pool.setPassword(PASS);

        pool.setInitialSize(3);
        pool.setMinIdle(3);
        pool.setMaxIdle(8);
        pool.setMaxTotal(8);
    }
    return pool;
}
public static Connection getConnection() throws SQLException {
    return getInstance().getConnection();
}
