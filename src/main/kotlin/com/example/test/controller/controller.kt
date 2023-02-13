package com.example.test.controller

import lombok.AllArgsConstructor
import lombok.Data
import org.springframework.web.bind.annotation.*

@RestController
class Controller{

    @GetMapping("/api")
    fun index(): Message{
        return Message("황주완",1)
    }

    @Data
    @AllArgsConstructor
    data class Message(
        var name: String,
        var age: Int,
    )
}
