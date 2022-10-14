package com.optic.kev.routes


import com.google.gson.JsonObject
import com.optic.kev.models.Address
import com.optic.kev.models.Category
import com.optic.kev.models.ResponseHttp
import com.optic.kev.models.User
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

interface CurrencyRoutes {

    @GET("convert?q=USD_COP&compact=ultra&apiKey=49307d27b3df453fc8f0")
    fun getCurrencyValue(): Call<JsonObject>


}