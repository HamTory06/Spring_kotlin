package com.example.test.controller

import lombok.Data
import org.apache.catalina.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Entity

@RestController
class Controller{
    @GetMapping("/message")
    fun index(): List<UserForm> = listOf (
        UserForm("홍길동","ghdrlfehd@gmail.com","123456789","010-1234-5678"),
        UserForm("황주완","ghkdwndhks@gmail.com","123456789","010-1234-5678"),
        UserForm("HamTory","HamTory@gmail.com","123456789","010-1234-56789")
    )
}
@Data
@Entity
data class UserForm(
    var name: String,
    var gmail: String,
    var password: String,
    var phone: String
)