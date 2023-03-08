package kazzuaki_project;

import java.util.Random;

public class RandomBookChoice {
    public static void main(String[] args) {
        Random random = new Random();
        String[] books = {"The Alchemist","Rich Dad Poor Dad"};
        int randomIndex = random.nextInt(books.length);
        String chosenBook = books[randomIndex];
        System.out.println("Your randomly selected book is: " + chosenBook);
    }
}
