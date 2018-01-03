package soudegesu.springboot.jdknine.main.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import soudegesu.springboot.jdknine.main.demo.model.User;
import soudegesu.springboot.jdknine.main.demo.service.UserService;

import java.util.List;

@Controller
public class SampleViewController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "index";
    }
}
