package org.launchcode.upblogz.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("welcome")
public class Welcome {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to 1Up Blogz");
        return "welcome/index";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String signupForm(Model model) {
        model.addAttribute("title", "Sign Up");
        return "welcome/signup";
    }








}