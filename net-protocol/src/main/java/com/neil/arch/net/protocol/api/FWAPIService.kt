package com.neil.arch.net.protocol.api

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * description ： TODO:类的作用
 * author : yujin
 * date : 2021/12/5 14:25
 */
interface FWAPIService {

    @GET
    fun <T> get(): Observable<T>

}

