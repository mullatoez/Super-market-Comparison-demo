package com.example.superdemo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductAdapter : RecyclerView.Adapter<ProductCustomViewHolder>() {

    private var items: List<ProductModel> = ArrayList()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCustomViewHolder {
        return ProductCustomViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.product_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductCustomViewHolder, position: Int) {

        val item = items[position]
        holder.productName.text = item.productName
        holder.productDesc.text = item.productDescription
        holder.productInStock.text = item.productInStock

        val imageTarget = holder.productImage
        Picasso.get().load(item.productImage).into(imageTarget)

    }

    fun submitList(productList: List<ProductModel>) {
        items = productList
    }
}

class ProductCustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val productName: TextView = itemView.findViewById(R.id.textView_product_name)
    val productDesc: TextView = itemView.findViewById(R.id.textView_product_description)
    val productInStock: TextView = itemView.findViewById(R.id.textView_in_stock)
    val productImage: ImageView = itemView.findViewById(R.id.imageView_product)

    init {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, ProductComparisonActivity::class.java)
            itemView.context.startActivity(intent)
        }
    }

}