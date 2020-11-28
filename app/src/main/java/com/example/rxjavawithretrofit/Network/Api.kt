package com.example.rxjavawithretrofit.Network

import com.example.rxjavawithretrofit.Model.Food
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface Api {
    @GET("/food.php")
    fun getAllData():Observable<List<Food>>
}