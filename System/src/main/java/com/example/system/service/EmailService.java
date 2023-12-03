package com.example.system.service;

import com.example.system.model.EmailDetails;

public interface EmailService {
    String sendSimpleMessage(EmailDetails details);

    String sendMessageAttachment(EmailDetails details);

}
