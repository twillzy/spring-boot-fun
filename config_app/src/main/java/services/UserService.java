package services;

import models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String checkout(User user) {
        return user.getName() + " is checking out";
    }
}
