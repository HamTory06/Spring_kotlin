package com.example.test

import com.example.test.controller.Message
import org.springframework.stereotype.Service

@Service
class MessageService(val db :MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }

}