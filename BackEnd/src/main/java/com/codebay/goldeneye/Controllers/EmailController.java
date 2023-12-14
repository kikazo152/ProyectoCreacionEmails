package com.codebay.goldeneye.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebay.goldeneye.Models.EmailData;
import com.codebay.goldeneye.Models.EmailRequest;
import com.codebay.goldeneye.Models.EmailResponse;
import com.codebay.goldeneye.Services.EmailProcessingService;
// import com.codebay.goldeneye.Services.EmailSender; --> // Activate when an email is set in the application.properties


// API RESPONSE TO EMAIL AND SENDING EMAIL WITH COPY

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/email")

public class EmailController {

    @Autowired
    private EmailProcessingService emailProcessingService;

    // @Autowired // -->  Activate when an email is set in the application.properties
    // private EmailSender emailSender; //--> Activate when an email is set in the application.properties

    @PostMapping("/process")
    public ResponseEntity<EmailResponse> processEmail(@RequestBody EmailRequest request) {
        String processedEmail = emailProcessingService.processEmail(request.getEmail());
        //suponemos que la api nos devuelve un email valido si lo es, y null si no.
        EmailData emailData = new EmailData("INVALID", processedEmail);
        EmailResponse response = new EmailResponse("KO", "Email is invalid. New address is suggested", emailData);       
        if(processedEmail.equals(request.getEmail())){
            emailData = new EmailData("VALID", processedEmail);
            response = new EmailResponse("OK", "Email is valid", emailData);
        }
        // emailSender.enviarCorreo(processedEmail, "info@codebay-innovation.com", "Bienvenida a GoldenEye-Codebay", "Bienvenido a codebay");  // --> Activate when an email is set in the application.properties  

        return ResponseEntity.ok(response);
    }
}