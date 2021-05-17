package com.iqmsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.model.Message;
import com.iqmsoft.repository.MessageRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void create(String message) {
        messageRepository.save(new Message(message));
    }
}
