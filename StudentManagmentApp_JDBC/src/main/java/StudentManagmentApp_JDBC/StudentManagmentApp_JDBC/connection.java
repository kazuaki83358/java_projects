package StudentManagmentApp_JDBC.StudentManagmentApp_JDBC;

public class connection {

    public void createConnection() {
        //load the driver
        try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
