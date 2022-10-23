package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class UserController {
    private Logger logger = Logger.getLogger("UserController");
    private UserService userService;

    @Autowired
    private void setUserService(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String printUsers(ModelMap model) {
        model.addAttribute("userlist", userService.allUsers());
        return "userpage";
    }

    @GetMapping(value = "/edit/{id}")
    public String show(@PathVariable("id") long id, ModelMap model) {
        model.addAttribute("user", userService.getById(id));
        return "edituser";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute("user") User user) {
        userService.edit(user);
        return "redirect:/";
    }

    @GetMapping(value = "/add")
    public String show(ModelMap model) {
        model.addAttribute("user", new User());
        return "adduser";
    }


    @PostMapping(value = "/add")
    public String add(@ModelAttribute("adduser") User user) {
        userService.add(user);
        return "redirect:/";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        userService.delete(userService.getById(id));
        return "redirect:/";
    }
}
