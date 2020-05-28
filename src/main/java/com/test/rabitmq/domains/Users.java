package com.test.rabitmq.domains;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer id;
    private String login;
    private String firstName;


    public Users(Integer id, String login, String firstName) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
