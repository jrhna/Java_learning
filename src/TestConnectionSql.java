//import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
//import com.microsoft.sqlserver.jdbc.SQLServerException;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class TestConnectionSql {
//    public static void main(String[] args) {
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser("sa");
//        ds.setPassword("12345678");
//        ds.setServerName("LAPTOP-R6DJEGR7");
//        ds.setPortNumber(1433); //port tcp/ip
//        ds.setDatabaseName("[AdventureWorks2022]");
//       // url = "jdbc:sqlserver://" +serverName + ":1433;DatabaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;
//        try (Connection conn = ds.getConnection()) {
//            System.out.println("ket noi thanh cong");
//            System.out.println(conn.getMetaData());
//        } catch (SQLServerException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnectionSql {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("12345678");
        ds.setServerName("LAPTOP-R6DJEGR7");
        ds.setPortNumber(1433); // Port TCP/IP
        ds.setDatabaseName("AdventureWorks2022"); // Correct format
        ds.setTrustServerCertificate(true); // Trusts server certificate without validation (option 2)

        try (Connection conn = ds.getConnection()) {
            System.out.println("Connection successful!");
            System.out.println("Database Metadata: " + conn.getMetaData().getDatabaseProductName());
            System.out.println(conn.getCatalog());
        } catch (SQLServerException e) {
            System.err.println("SQLServerException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }
}

