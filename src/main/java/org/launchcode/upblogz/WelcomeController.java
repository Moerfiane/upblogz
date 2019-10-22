package org.launchcode.upblogz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class WelcomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to 1Up Blogz");
        return "welcome/index";
    }

    @RequestMapping(value = "signup")
    public String signupForm(Model model) {
        model.addAttribute("title", "Sign Up");
        return "welcome/signup";
    }




}
