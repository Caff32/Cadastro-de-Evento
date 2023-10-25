package com.work.event.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @GetMapping
    public String Hello(){

        return "Olá !";
    }
    @PostMapping
    public void registerEvent (){


    }

}
