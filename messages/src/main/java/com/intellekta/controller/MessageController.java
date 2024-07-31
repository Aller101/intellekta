/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.controller;

import com.intellekta.model.Message;
import com.intellekta.repository.MessageRepo;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alekseynesterov
 */
@Controller
public class MessageController {
    
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String showHomePage(Model model) {
        return "login";
    }

    @PostMapping("/set-username")
    public String setUsername(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("messages", messageRepo.findAll());
        return "messages";
    }

    @PostMapping("/add-message")
    public String addMessage(@RequestParam String text, @RequestParam String username, Model model) {
        messageRepo.save(new Message(text, username));
        model.addAttribute("username", username);
        model.addAttribute("messages", messageRepo.findAll());
        return "messages";
    }

    @GetMapping("/filter")
    public String filterMessages(@RequestParam String senderName, @RequestParam String username, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("messages", messageRepo.findByName(senderName));
        return "messages";
    }
    
}