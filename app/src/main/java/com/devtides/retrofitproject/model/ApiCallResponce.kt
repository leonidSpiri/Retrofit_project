package com.devtides.retrofitproject.model

data class ApiCallResponce(
    val method:String?,
    val query: Map<String, String>?,
    val headers:Map<String, String>?)