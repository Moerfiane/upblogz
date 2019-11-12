package org.launchcode.upblogz.Models;


import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String username;

    @NotNull
    @Size(min=3, max=15)
    private String password;

    @OneToOne
    private User user;

    public User(){

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    private static String password(String password) {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
