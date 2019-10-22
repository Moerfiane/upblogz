package org.launchcode.upblogz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
@RequestMapping("signup")
public class UserController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "signup");
        return "signup/index";

    }





}