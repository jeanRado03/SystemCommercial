package com.example.system.service;

import com.example.system.model.EmailDetails;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private JavaMailSender emailSender;
    @Value("${spring.mail.username}") private String sender;
    @Override
    public String sendSimpleMessage(EmailDetails details) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(sender);
            message.setTo(details.getRecipient());
            message.setSubject(details.getSubject());
            message.setText(details.getMsgBody());
            emailSender.send(message);
            return "Mail Sent Successfully...";
        } catch (Exception e) {
            return "Error while sending mail";
        }
    }
    @Override
    public String sendMessageAttachment(EmailDetails details) {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(details.getRecipient());
            helper.setSubject(details.getSubject());
            helper.setText(details.getMsgBody());
            FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));
            helper.addAttachment(file.getFilename(),file);
            emailSender.send(message);
            return "Mail Sent Successfully...";
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
