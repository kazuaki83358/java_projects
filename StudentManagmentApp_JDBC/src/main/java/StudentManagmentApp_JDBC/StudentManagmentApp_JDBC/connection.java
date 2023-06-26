package StudentManagmentApp_JDBC.StudentManagmentApp_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	//variable for storing 
	static Connection connect;
	//making connection to database
    public static Connection createConnection() throws SQLException {
        //load the driver
        try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String user = "root";
			String password = "kazuaki2004";
			String url = "jdbc:mysql://localhost:3306/student_managment?serverTimezone=UTC";
			connect = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return connect;
    }
}