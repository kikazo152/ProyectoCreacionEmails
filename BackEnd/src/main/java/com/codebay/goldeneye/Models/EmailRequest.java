package com.codebay.goldeneye.Models;

// EMAIL REQUEST 

public class EmailRequest {
    private String email;
    private String method;


    // CONSTRUCTOR, GETTER AND SETTERS FOR 'METHOD'

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
