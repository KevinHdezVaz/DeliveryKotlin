package com.optic.kev.routes


import com.optic.kev.models.Category
import com.optic.kev.models.MercadoPagoPayment
import com.optic.kev.models.ResponseHttp
import com.optic.kev.models.User
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface PaymentsRoutes {

    @POST("payments/create")
    fun createPayment(
        @Body mercadoPagoPayment: MercadoPagoPayment,
        @Header("Authorization") token: String
    ): Call<ResponseHttp>



}