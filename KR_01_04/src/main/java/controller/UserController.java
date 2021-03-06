package controller;

import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import repository.UserRepository;

import java.util.List;

public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/getUser={id}")
    User getUser(@PathVariable Long id) {
        return this.userRepository.findUserById(id);
    }

    @GetMapping("/allUsers")
    List<User> getUsers() {
        return this.userRepository.findAll();
    }

    // TODO @PostMapping addUser
}
