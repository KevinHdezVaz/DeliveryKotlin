package com.optic.kev.providers

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.optic.kev.api.MercadoPagoApiRoutes
import com.optic.kev.models.MercadoPagoCardTokenBody
import com.optic.kev.routes.MercadoPagoRoutes
import retrofit2.Call

class MercadoPagoProvider {

    var mercadoPagoRoutes: MercadoPagoRoutes? = null

    init {
        val api = MercadoPagoApiRoutes()
        mercadoPagoRoutes = api.getMercadoPagoRoutes()
    }

    fun getInstallments(bin: String, amount: String): Call<JsonArray>? {
        return mercadoPagoRoutes?.getInstallments(bin, amount)
    }

    fun createCardToken(mercadoPagoCardTokenBody: MercadoPagoCardTokenBody): Call<JsonObject>? {
        return mercadoPagoRoutes?.createCardToken(mercadoPagoCardTokenBody)
    }

}