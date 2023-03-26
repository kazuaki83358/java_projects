package cahtgpt3.chatgpt3client;

import okhttp3.*;
import java.io.IOException;

public class ChatGPT3Client {
    private final String apiKey;
    private final OkHttpClient httpClient;

    public ChatGPT3Client(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = new OkHttpClient();
    }

    @SuppressWarnings("deprecation")
    public String generateText(String prompt, int maxTokens) throws IOException {
        MediaType mediaType = MediaType.parse("application/json");
        String requestBody = String.format("{\"prompt\": \"%s\",\"temperature\": 0.7,\"max_tokens\": %d}", prompt, maxTokens);
        RequestBody body = RequestBody.create(mediaType, requestBody);
        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/engines/davinci/completions")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + apiKey)
                .build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

}
