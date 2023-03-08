package kazzuaki_project;

import java.util.Random;

public class random_gmail {
	public static String getRandomWord(String [] word) {
		Random nr = new Random();
		int Index = nr.nextInt(word.length);
		return word[Index];
	}
	public static String getRandomDomain(String [] domain) {
		Random nr = new Random();
		int Index = nr.nextInt(domain.length);
		return domain[Index];
	}
public static void main(String[] args) {
	String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com" };
    String[] words = { "apple", "banana", "carrot", "dog", "elephant", "flower", "guitar" };
    String email = getRandomWord(words) + "@" + getRandomWord(words) + "." + getRandomDomain(domains);
    System.out.println(email);
}
}

