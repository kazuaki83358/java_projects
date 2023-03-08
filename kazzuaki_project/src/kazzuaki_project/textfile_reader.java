package kazzuaki_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textfile_reader {
public static void main(String[] args) throws IOException {
	try {
	FileReader file = new FileReader("nishant.txt");
	BufferedReader reader = new BufferedReader(file);
	System.out.println(reader.readLine());
	reader.hashCode();}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
