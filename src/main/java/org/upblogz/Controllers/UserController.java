package org.upblogz.Controllers;



import org.upblogz.Models.Data.UserDao;
import org.upblogz.Models.Forms.SignupForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("signup")
public class UserController {

    @Autowired
    private UserDao userDAO;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        model.addAttribute("SignupForm", userDAO.findAll());

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(@ModelAttribute @Valid SignupForm signupForm, Errors errors, Model model) {


        if (errors.hasErrors()) {
            return "signup";
        }


        String username = signupForm.getUsername();
        String password = signupForm.getPassword();

        return "welcome";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You're logged in.");

        return "login";
    }




}
