package com.optic.kev.providers

import android.util.Log
import com.google.gson.JsonObject
import com.optic.kev.api.ApiRoutes
import com.optic.kev.api.CurrencyApiRoutes
import com.optic.kev.models.Address
import com.optic.kev.models.Category
import com.optic.kev.models.ResponseHttp
import com.optic.kev.models.User
import com.optic.kev.routes.AddressRoutes
import com.optic.kev.routes.CategoriesRoutes
import com.optic.kev.routes.CurrencyRoutes
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import java.io.File

class CurrencyProvider() {

    private var currencyRoutes: CurrencyRoutes? = null

    init {
        val api = CurrencyApiRoutes()
        currencyRoutes = api.getCurrencyRoutes()
    }

    fun getCurrencyValue(): Call<JsonObject>? {
        return currencyRoutes?.getCurrencyValue()
    }


}