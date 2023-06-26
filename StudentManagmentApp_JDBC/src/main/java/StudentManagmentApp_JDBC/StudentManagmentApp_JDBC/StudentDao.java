package StudentManagmentApp_JDBC.StudentManagmentApp_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(student st) {
		boolean f = false;
		try {
			//JDBC query and connection
			 Connection connect = connection.createConnection();
			 String query = "insert into students(sname,sphone,scity) value(?,?,?)";
			//Prepared statement 
			 PreparedStatement pstmt = connect.prepareStatement(query);
			//set the value of parameters 
			 pstmt.setString(1, st.getStudentname());
			 pstmt.setString(2, st.getStudentphone());
			 pstmt.setString(3, st.getStudentcity());
			 
			 //execute
			 pstmt.executeUpdate();
			 f = true;
			 
			 
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deletStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			//JDBC query and connection
			 Connection connect = connection.createConnection();
			 String query = "delete from students where sid=?";
			//Prepared statement 
			 PreparedStatement pstmt = connect.prepareStatement(query);
			//set the value of parameters 
			 pstmt.setInt(1, userId); 
			 //execute
			 pstmt.executeUpdate();
			 f = true;
			 
			 
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	public static void displayStudents() {
		// TODO Auto-generated method stub
		
		try {
			//JDBC query and connection
			 Connection connect = connection.createConnection();
			 String query = "select * from students;";
			 Statement stmt = connect.createStatement();
			 stmt.executeQuery(query);
			 
			 ResultSet set = stmt.executeQuery(query);
			 while(set.next()) {
				 int id = set.getInt(1);
				 String name = set.getString(2);
				 String phone = set.getString(3);
				 String city = set.getString(4);
				 System.out.println("ID : "+ id);
				 System.out.println("name : "+ name);
				 System.out.println("phone : "+ phone);
				 System.out.println("city : "+ city);
				 System.out.println("-----------------------------------------------");
				 
			 }
			 
			 
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
