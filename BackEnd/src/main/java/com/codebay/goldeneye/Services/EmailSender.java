package com.codebay.goldeneye.Services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    private final JavaMailSender javaMailSender;
    public EmailSender(JavaMailSender javaMailSender) {
       this.javaMailSender = javaMailSender;
    }

    public void enviarCorreo(String destinatario, String copyTo, String asunto, String mensaje) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(destinatario);
        mailMessage.setCc(copyTo);
        mailMessage.setSubject(asunto);
        mailMessage.setText(mensaje);

        javaMailSender.send(mailMessage);
    }
}
