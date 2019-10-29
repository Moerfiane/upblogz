package org.launchcode.upblogz.Controllers;


import org.launchcode.upblogz.Model.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private SecurityService securityService;

}
