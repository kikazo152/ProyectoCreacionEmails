package com.codebay.goldeneye.Models;

// EMAIL DATA 

public class EmailData {
    private String result;
    private String finalEmail;

    // Constructor that accepts two parameters
    public EmailData(String result, String finalEmail) {
        this.result = result;
        this.finalEmail = finalEmail;
    }

    // Getters y setters

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFinalEmail() {
        return finalEmail;
    }

    public void setFinalEmail(String finalEmail) {
        this.finalEmail = finalEmail;
    }
}
