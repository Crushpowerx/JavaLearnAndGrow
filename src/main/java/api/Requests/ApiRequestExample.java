package api.Requests;

import static api.Requests.ApiRequestMethods.addNewUser;
import static api.Requests.ApiRequestMethods.getUsers;
import static java.lang.Thread.sleep;

public class ApiRequestExample {
    public static void main(String[] args) throws InterruptedException {
        String json = "{\"id\":\"1\",\"firstName\":\"John\",\"lastName\":\"Rock\",\"email\":\"test@test.com\"}";
        addNewUser(json);
        sleep(1000);
        getUsers();
    }
}
