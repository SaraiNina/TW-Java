package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    public static Connection createConnection() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Drive");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "nina84");
            if (conn != null) {
                System.out.println("Connected to the database!");

            } else {
                System.out.println("Failed to make connection");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
            return conn;

    }

    }
