import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "iadp$110";
    //    private static String databaseName = "phonebook";
    private static Connection connection;

//    public ConnectionToDB(String url, String username, String password, String databaseName) {
//        this.url = url;
//        this.username = username;
//        this.password = password;
//        this.databaseName = databaseName;
//    }

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("error");
        }
        return connection;
    }
}
