package com.atlantasanad.healthinsurance;

public class member {

    private String name;
    private String email;
    private String phone;
    private String login;
    private String password;


    public member(String name, String email, String phone, String login, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    }

