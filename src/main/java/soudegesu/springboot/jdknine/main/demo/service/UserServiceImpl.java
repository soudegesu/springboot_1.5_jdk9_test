package soudegesu.springboot.jdknine.main.demo.service;

import soudegesu.springboot.jdknine.main.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("hoge");
        users.add(user);
        return users;
    }
}
