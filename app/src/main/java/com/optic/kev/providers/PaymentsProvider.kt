package com.optic.kev.providers

import android.util.Log
import com.optic.kev.api.ApiRoutes
import com.optic.kev.models.Category
import com.optic.kev.models.MercadoPagoPayment
import com.optic.kev.models.ResponseHttp
import com.optic.kev.models.User
import com.optic.kev.routes.CategoriesRoutes
import com.optic.kev.routes.PaymentsRoutes
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import java.io.File

class PaymentsProvider(val token: String) {

    private var paymentsRoutes: PaymentsRoutes? = null

    init {
        val api = ApiRoutes()
        paymentsRoutes = api.getPaymentsRoutes(token)
    }

    fun create(mercadoPagoPayment: MercadoPagoPayment): Call<ResponseHttp>? {
        return paymentsRoutes?.createPayment(mercadoPagoPayment, token)
    }

}