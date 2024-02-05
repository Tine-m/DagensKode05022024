package com.example.helloversion2.repositories;

import com.example.helloversion2.models.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepository {

    List<Message> messageList =
            new ArrayList<>(List.of(new Message(1, "hello"), new Message(2, "hej")));

    public Message getMessage(int id) {
        return messageList.get(id-1);
    }
}
