import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Misha",24);
        userService.saveUser(user);
        System.out.println(user);
    }
}
