package com.optic.kev.api

import com.optic.kev.routes.*
import retrofit2.Retrofit

class CurrencyApiRoutes {

    val API_URL = "https://free.currconv.com/api/v7/"
    val retrofit = RetrofitClient()

    fun getCurrencyRoutes(): CurrencyRoutes {
        return retrofit.getClient(API_URL).create(CurrencyRoutes::class.java)
    }

}