package com.project.db.service;

import com.project.db.entity.Message;
import com.project.db.repository.MsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgService {
    @Autowired
    private MsgRepository repository;
    public List<Message> getMessages(){
        return repository.findAll();
    }

    public Message setMessage(Message message){
        return repository.save(message);
    }
}
