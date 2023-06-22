package cahtgpt3.chatgpt3client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner nr = new Scanner(System.in);
        String apiKey = "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";
        ChatGPT3Client client = new ChatGPT3Client(apiKey);
        try {
            while (true) {
                System.out.print("You: ");
                String prompt = nr.nextLine().trim();
                if (prompt.isEmpty()) {
                    break;
                }
                String response = client.generateText(prompt,100);
                System.out.println("ChatGPT3: " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
