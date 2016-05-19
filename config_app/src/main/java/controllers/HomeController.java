package controllers;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
public class HomeController {
    private UserService userService;

    @Value("${home-message}")
    private String msg;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    private String home() {
        return msg;
    }

    @RequestMapping("/user")
    private String displayUser() {
        User user = new User("Will");
        return userService.checkout(user);
    }
}
