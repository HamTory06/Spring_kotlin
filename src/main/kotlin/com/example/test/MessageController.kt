package com.example.test

import com.example.test.controller.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {

    @GetMapping("/message")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/message")
    fun post(@RequestBody message: Message){
        service.post(message)
    }
}