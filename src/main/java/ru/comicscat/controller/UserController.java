package ru.comicscat.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.comicscat.model.User;

/**
 * @author Vitali Usik
 * 
 */
@Controller
@RequestMapping("/backoffice/users")
public class UserController {

//    private UserService userService;
//    
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(method = RequestMethod.GET, params="newprofile")
    public String createUserProfile(Model model) {
        model.addAttribute(new User());
        return "users/edit";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addUserProfileFromForm(@Valid User user, BindingResult bindingResult) {
        if (user.getUser_register_date() == null) {
            user.setUser_register_date(new Date());
        }
        System.out.println("....");
        if(bindingResult.hasErrors()) {
            System.out.println(user.getUser_login() + " " + user.getUser_pass() + " " + user.getUser_name() + " " +
                    user.getUser_surname() + " " + user.getUser_mail() + " " + user.getUser_register_date() + " " +
                    user.getUser_role() + " errors" + bindingResult.getAllErrors());
            return "users/edit";
        }
        System.out.println("success!");
        return "redirect:/";
    }
}
