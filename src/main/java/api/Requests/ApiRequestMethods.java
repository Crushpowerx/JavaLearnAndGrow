package api.Requests;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class ApiRequestMethods {
    private static final OkHttpClient httpClient = new OkHttpClient();

    public static void addNewUser(String json) {
        RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .url("http://localhost:4567/users")
                .addHeader("content-type", "application/json")
                .post(body)
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String result = Objects.requireNonNull(response.body()).string();
            Gson resultToJSON = new Gson();
            resultToJSON.toJson(result);
            httpClient.connectionPool().evictAll();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getUsers() {
        Request request = new Request.Builder()
                .url("http://localhost:4567/users")
                .addHeader("content-type", "application/json")
                .get()
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String result = Objects.requireNonNull(response.body()).string();
            Gson resultToJSON = new Gson();
            resultToJSON.toJson(result);
            httpClient.connectionPool().evictAll();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getUserByID(String ID) {
        Request request = new Request.Builder()
                .url("http://localhost:4567/users/:id")
                .addHeader("content-type", "application/json")
                .get()
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String result = Objects.requireNonNull(response.body()).string();
            Gson resultToJSON = new Gson();
            resultToJSON.toJson(result);
            httpClient.connectionPool().evictAll();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
