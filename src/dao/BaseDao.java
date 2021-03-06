package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class BaseDao {
    private static final String connectionUrl =
            "jdbc:sqlserver://localhost:1433;"
                    + "database=spesaonline;" //nome db su mssql
                    + "user=SA;" //username di mssql
                    + "password=_secret_1234;" //vostra password al mssql
                    + "loginTimeout=30;";

    static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}