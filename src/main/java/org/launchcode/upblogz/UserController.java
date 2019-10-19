package org.launchcode.upblogz;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "signup");

        return "signup/index";

    }
     @RequestMapping(value = "add", method = RequestMethod.GET)
     public String add(Model model) {
        model.addAttribute(new User());
        model.addAttribute(("title", "Create an Account");
        return "user/add";
     }
     @RequestMapping(value = "add", method = RequestMethod.POST)
     public String add(@ModelAttribute @Valid User user, errors errors, String verify, Model model) {

        model.addAttribute("user", user);
        boolean passMatch = true;


     }




}