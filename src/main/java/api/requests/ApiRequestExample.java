package api.requests;

import static api.requests.ApiRequestMethods.addNewUser;
import static api.requests.ApiRequestMethods.getUsers;
import static java.lang.Thread.sleep;

public class ApiRequestExample {
    public static void main(String[] args) throws InterruptedException {
        String json = "{\"id\":\"1\",\"firstName\":\"John\",\"lastName\":\"Rock\",\"email\":\"test@test.com\"}";
        addNewUser(json);
        sleep(1000);
        getUsers();
    }
}
