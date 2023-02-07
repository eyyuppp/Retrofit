package com.eyyuperdogan.registerlocation.retrofitkotlin.service

import com.eyyuperdogan.registerlocation.retrofitkotlin.module.CryptoModule
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoApı {
    //get ,post,update,delete
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    //https://api.nomics.com/v1/
    // prices?key=2187154b76945f2373394aa34f7dc98a

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModule>>

    //fun getData(): Call<List<CryptoModel>>

}