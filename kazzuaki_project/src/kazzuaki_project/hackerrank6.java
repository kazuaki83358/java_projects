package kazzuaki_project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class hackerrank6 {
	public static String getday(int month,int day,int year) {
		LocalDate date = LocalDate.of(year, month, day);
		return date.format(DateTimeFormatter.ofPattern("EEEE")).toUpperCase();
	}
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	int month = nr.nextInt();
	int day = nr.nextInt();
	int year = nr.nextInt();
	String Day = getday(month, day, year);
	System.out.println(Day);
}
}
