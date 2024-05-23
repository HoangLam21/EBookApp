package com.plcoding.e_book.domain.model.Register

data class Result(
    val address: String,
    val avatar: String,
    val birthday: String,
    val createAt: String,
    val createBy: String,
    val email: String,
    val fullname: String,
    val gender: Int,
    val id: Int,
    val isvip: Boolean,
    val phonenumber: String,
    val updateAt: String,
    val updateBy: String
)