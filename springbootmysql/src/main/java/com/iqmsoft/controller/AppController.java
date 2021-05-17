package com.iqmsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.iqmsoft.service.MessageService;

@RequestMapping("/test")
@RestController
public class AppController {

    @Autowired
    MessageService messageService;

    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public String sayHello(@RequestParam(value = "message") String message) {
        messageService.create(message);
        return message;
    }
}
