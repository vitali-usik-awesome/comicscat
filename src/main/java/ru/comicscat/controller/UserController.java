package ru.comicscat.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.comicscat.model.User;
import ru.comicscat.service.UserService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
@RequestMapping("/backoffice/users")
public class UserController {

    private static final String DATE_FORMAT = "YYYY-MM-DD hh:mm:ss";
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(method = RequestMethod.GET, params="newprofile")
    public String createUserProfile(Model model) {
        model.addAttribute(new User());
        return "users/edit";
    }

    @RequestMapping(method = RequestMethod.POST, params="newprofile")
    public String addUserProfileFromForm(@Valid User user, BindingResult bindingResult) {
//        System.out.println(user.getUser_login() + " " + user.getUser_pass() + " " + user.getUser_name() + " " +
//                user.getUser_surname() + " " + user.getUser_mail() + " " + user.getUser_register_date() + " " +
//                user.getUser_role() + " errors" + bindingResult.getAllErrors() + "count: " + bindingResult.getErrorCount() + bindingResult.getGlobalErrorCount());
        System.out.println("....");
        if(bindingResult.hasErrors()) {
            System.out.println("had errors" + bindingResult.getAllErrors());
            return "users/edit";
        }
        userService.saveProfile(user);
        System.out.println("success!");
        return "redirect:/";
    }
}
