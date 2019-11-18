package org.upblogz.Models;


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

    public int getId() {
        return id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = getId();
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
