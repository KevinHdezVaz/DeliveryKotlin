package com.optic.kev.providers

import android.util.Log
import com.optic.kev.api.ApiRoutes
import com.optic.kev.models.Category
import com.optic.kev.models.ResponseHttp
import com.optic.kev.models.User
import com.optic.kev.routes.CategoriesRoutes
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import java.io.File

class CategoriesProvider(val token: String) {

    private var categoriesRoutes: CategoriesRoutes? = null

    init {
        val api = ApiRoutes()
        categoriesRoutes = api.getCategoriesRoutes(token)
    }

    fun getAll(): Call<ArrayList<Category>>? {
        return categoriesRoutes?.getAll(token)
    }

    fun create(file: File, category: Category): Call<ResponseHttp>? {
        val reqFile = RequestBody.create(MediaType.parse("image/*"), file)
        val image = MultipartBody.Part.createFormData("image", file.name, reqFile)

        Log.d("CATEGORY", category.toJson())

        val requestBody = RequestBody.create(MediaType.parse("text/plain"), category.toJson())
        return categoriesRoutes?.create(image, requestBody, token)
    }

}