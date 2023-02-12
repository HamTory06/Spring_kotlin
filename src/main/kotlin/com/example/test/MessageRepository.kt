package com.example.test

import com.example.test.controller.Message
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository


interface MessageRepository: CrudRepository<Message, String> {
    @Query("select * from Message")
    fun findMessages(): List<Message>
}
