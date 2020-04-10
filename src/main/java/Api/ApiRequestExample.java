package Api;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class ApiRequestExample {
    private static final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        String json = "{\"id\":\"1\",\"firstName\":\"John\",\"lastName\":\"Rock\",\"email\":\"test@test.com\"}";

        RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
        System.out.println(body);

        Request request = new Request.Builder()
                .url("http://localhost:4567/users")
                .addHeader("content-type", "application/json")
                .post(body)
                .build();
        System.out.println(request);

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String result = Objects.requireNonNull(response.body()).string();
            Gson resultToJSON = new Gson();
            resultToJSON.toJson(result);
            httpClient.connectionPool().evictAll();
            System.out.println(resultToJSON);
        }
    }

}
