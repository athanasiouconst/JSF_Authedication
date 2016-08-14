/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athanasiou.login;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author costas
 */
@ManagedBean (name="loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;
    public boolean isLoggedIn = false;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

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

    public String action() {

        isLoggedIn = true;
        return "forum.xhtml?faces-redirect=true";

    }

}
