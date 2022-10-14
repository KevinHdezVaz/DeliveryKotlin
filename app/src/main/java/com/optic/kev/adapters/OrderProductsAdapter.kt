package com.optic.kev.adapters

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.optic.kev.R
import com.optic.kev.activities.client.home.ClientHomeActivity
import com.optic.kev.activities.client.products.detail.ClientProductsDetailActivity
import com.optic.kev.activities.client.shopping_bag.ClientShoppingBagActivity
import com.optic.kev.activities.delivery.home.DeliveryHomeActivity
import com.optic.kev.activities.restaurant.home.RestaurantHomeActivity
import com.optic.kev.models.Category
import com.optic.kev.models.Product
import com.optic.kev.models.Rol
import com.optic.kev.utils.SharedPref

class OrderProductsAdapter(val context: Activity, val products: ArrayList<Product>): RecyclerView.Adapter<OrderProductsAdapter.OrderProductsViewHolder>() {

    val sharedPref = SharedPref(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderProductsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_order_products, parent, false)
        return OrderProductsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: OrderProductsViewHolder, position: Int) {

        val product = products[position] // CADA UNA DE LAS CATEGORIAS

        holder.textViewName.text = product.name

        if (product.quantity != null) {
            holder.textViewQuantity.text = "${product.quantity!!}"
        }
        Glide.with(context).load(product.image1).into(holder.imageViewProduct)
    }

    class OrderProductsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imageViewProduct: ImageView
        val textViewName: TextView
        val textViewQuantity: TextView

        init {
            imageViewProduct = view.findViewById(R.id.imageview_product)
            textViewName = view.findViewById(R.id.textview_name)
            textViewQuantity = view.findViewById(R.id.textview_quantity)
        }

    }

}