package com.codebay.goldeneye.Models;

// EMAIL RESPONSE


public class EmailResponse {
    private String status;
    private String message;
    private EmailData data;

    // CONSTRUCTOR THAT ACCEPTS THREE PARAMETERS
    public EmailResponse(String status, String message, EmailData data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // GETTERS AND SETTERS

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmailData getData() {
        return data;
    }

    public void setData(EmailData data) {
        this.data = data;
    }
}
