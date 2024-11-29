package com.example.cupmovil.Adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cupmovil.DataClass.Order
import com.example.cupmovil.R

class OrderAdapter(private val orders: List<Order>) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    // ViewHolder para cada elemento
    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.order_name)
        val status: TextView = itemView.findViewById(R.id.order_status)
        val subtitle: TextView = itemView.findViewById(R.id.order_subtitle)
        val image: ImageView = itemView.findViewById(R.id.order_image)
        val action: ImageView = itemView.findViewById(R.id.order_action)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val order = orders[position]
        holder.title.text = order.title
        holder.status.text = order.status
        holder.subtitle.text = order.subtitle
        holder.image.setImageResource(order.imageResId)

        // Configura acción al presionar el botón (opcional)
        holder.action.setOnClickListener {
            // Acción al presionar el botón
        }
    }

    override fun getItemCount(): Int = orders.size
}

