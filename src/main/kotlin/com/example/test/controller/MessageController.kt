package com.example.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Table

@RestController
class MessageController {
    @GetMapping("/message")
    fun index(): List<Message> = listOf(
        Message("1", "Hello"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!")
    )
}

@Table(name = "Message")
data class Message(val id: String?, val text: String)