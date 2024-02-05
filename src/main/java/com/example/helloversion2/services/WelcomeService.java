package com.example.helloversion2.services;

import com.example.helloversion2.models.Message;
import com.example.helloversion2.repositories.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    private MessageRepository messageRepository = new MessageRepository();

    public Message sayWelcome(int id) {
        return messageRepository.getMessage(id);
    }
}
