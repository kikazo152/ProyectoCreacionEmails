package com.codebay.goldeneye.Services;

import org.springframework.stereotype.Service;

@Service
public class EmailProcessingService {

    public String processEmail(String email) {
        // It will be done by calling an api that Codebay will provide
        // For now, we just return the same email without changes, we assume that's fine.

        if(email.contains("error")){
            return "lcarrasco.design@milan.goldeneye.com";
        }

        return email;
    }
}