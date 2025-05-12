import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import the package
            load and register
            create a statement
            execute statements
            process the results
            close
         */

        String url = "jdbc:postgresql://localhost:5433/demo";
        String userName = "postgres";
        String password = "root";
        String query = "delete from student where sid=2";

//        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection established!");
        Statement st = conn.createStatement();

//        System.out.println(resultSet.next());
        conn.close();
        System.out.println("Connection closed!");


    }
}