package com.roger.repository.data

data class BaseResult<T>(
    val data:T,
    val errorCode:Int,
    val errorMsg:String
)
