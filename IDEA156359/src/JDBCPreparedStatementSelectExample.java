import java.sql.PreparedStatement;
import java.sql.ResultSet;




import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCPreparedStatementSelectExample {

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@//idea-qa-temp-2:1521/xe";
    private static final String DB_USER = "guest";
    private static final String DB_PASSWORD = "guest";

    public static void main(String[] argv) {

        try {

            selectRecordsFromTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void selectRecordsFromTable() throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT USER_ID, USERNAME FROM DBUSER WHERE USER_ID = ?";

        try {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, 4);

            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String userid = rs.getString("USER_ID");
                String username = rs.getString("USERNAME");

                System.out.println("userid : " + userid);
                System.out.println("username : " + username);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

    private static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }

}