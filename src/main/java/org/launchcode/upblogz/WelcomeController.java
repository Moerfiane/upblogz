package org.launchcode.upblogz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Controller
@RequestMapping("welcome")
public class WelcomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        Scanner input = new Scanner(System.in);

        String user, pass;

        System.out.print("Enter your username: ");
        user = input.nextLine();

        System.out.print("Enter your password: ");
        pass = input.nextLine();

        if(user.equals(user) && pass.equals(pass))
            System.out.println("You are logged in");







        model.addAttribute("title", "Welcome to 1Up Blogz");
        return "welcome/index";
    }



}
