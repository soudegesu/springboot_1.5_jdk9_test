package soudegesu.springboot.jdknine.main.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import soudegesu.springboot.jdknine.main.demo.entity.UserEntity;
import soudegesu.springboot.jdknine.main.demo.model.User;
import org.springframework.stereotype.Service;
import soudegesu.springboot.jdknine.main.demo.repository.UserRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {

        userRepository.findAll();

        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("hoge");
        users.add(user);
        return users;
    }
}
