package com.example.cupmovil.Adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cupmovil.DataClass.Producto
import com.example.cupmovil.R

class ProductoAdaptador(private val productList: List<Producto>) :
    RecyclerView.Adapter<ProductoAdaptador.ProductViewHolder>() {

    // ViewHolder: referencia a las vistas del CardView
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.productImage)
        val productTitle: TextView = itemView.findViewById(R.id.productTitle)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)
        val productDescription: TextView = itemView.findViewById(R.id.productDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_producto1, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.productTitle.text = product.title
        holder.productDescription.text = product.description
        holder.productPrice.text = product.precio
        holder.productImage.setImageResource(product.imageResId)
    }

    override fun getItemCount(): Int = productList.size
}
