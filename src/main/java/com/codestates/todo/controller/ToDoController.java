package com.codestates.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
