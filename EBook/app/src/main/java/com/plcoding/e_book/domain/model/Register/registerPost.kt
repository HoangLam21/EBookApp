package com.plcoding.e_book.domain.model.Register

data class registerPost(
    val username: String,
    val password: String,
    val repassword: String,
    val email: String,
    val phonenumber: String,
    val fullname: String
)