package com.example.system.controller;

import com.example.system.model.EmailDetails;
import com.example.system.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/sendmailurl")
public class EmailController {
    @Autowired
    EmailServiceImpl emailService;

    @PostMapping(path="/send")
    public void sendMail(@RequestBody EmailDetails details) {
        emailService.sendSimpleMessage(details);
    }

    @PostMapping(path="/sendattachment")
    public void sendMailwithAttachment(@RequestBody EmailDetails details) {
        emailService.sendMessageAttachment(details);
    }
}
