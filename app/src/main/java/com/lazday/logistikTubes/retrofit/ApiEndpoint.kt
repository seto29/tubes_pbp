package com.lazday.logistikTubes.retrofit

import com.lazday.logistikTubes.MainModel
import retrofit2.Call
import retrofit2.http.*

interface ApiEndpoint {

    @GET("products/GetAll.php")
    fun data(): Call<MainModel>
}