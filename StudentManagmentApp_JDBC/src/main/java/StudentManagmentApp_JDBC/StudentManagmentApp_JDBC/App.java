package StudentManagmentApp_JDBC.StudentManagmentApp_JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Welcome to student managment system" );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				//add student
				System.out.println("Enter user name: ");
				String name = br.readLine();
				System.out.println("Enter phone number");
				String phone = br.readLine();
				System.out.println("ENter city");
				String city = br.readLine();
				
				//create student object for store details
				student st = new student(name,phone,city);
				System.out.println(st);
			}
			else if(c==2) {
				//delete student
				
			}
			else if(c==3) {
				//display student
				
			}
			else if(c==4) {
				//exit
				break;
			}
			else {
				
				
			}
		}
        System.out.println("thanks for using or app.......");
        System.out.println("see you soon.......");
    }
}