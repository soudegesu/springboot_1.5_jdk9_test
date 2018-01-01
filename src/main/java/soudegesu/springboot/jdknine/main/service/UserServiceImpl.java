package soudegesu.springboot.jdknine.main.service;

import soudegesu.springboot.jdknine.main.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();

        users.add(user);
        return users;
    }
}
