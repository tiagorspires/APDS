package Database;

public class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
        System.out.println("DB Connection created");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void consult(String query) {
        System.out.println("Query: " + query);
    }

}
