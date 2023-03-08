package kazzuaki_project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Textfile_making {
	public static void main(String[] args) throws IOException {
		String str = "Hello everyone it's nishant";
		try {
		FileWriter file = new FileWriter("nishant.txt");
		BufferedWriter writer = new BufferedWriter(file);
		writer.write(str);
		writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("your file has been created");
	}
}
