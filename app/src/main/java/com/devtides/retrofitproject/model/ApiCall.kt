package com.devtides.retrofitproject.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiCall {
    @GET("current?access_key=a1b008ad7b69101ce2d97111662f8e68")
    fun callGet(): Call<ApiCallResponce>
}