package org.launchcode.upblogz.Models.Forms;

import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import sun.rmi.runtime.Log;

import java.beans.Transient;


public class SignupForm {


    private String username;
    private String password;





    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }












}
