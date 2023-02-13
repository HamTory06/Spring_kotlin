package com.example.test.dto

import lombok.AllArgsConstructor
import lombok.Data

@Data
@AllArgsConstructor
data class Login (
    var id: Long,
    var name: String,
    var password: String
)