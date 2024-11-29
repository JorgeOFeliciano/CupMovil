package com.example.cupmovil

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cupmovil.Adaptador.OrderAdapter
import com.example.cupmovil.DataClass.Order

class Carrito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carrito)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_orders)

        // Lista de datos ficticios
        val orders = listOf(
            Order("Cafe Latte", "Coffeinopia Bogor", "Pick Up", R.drawable.cafecito),
            Order("Cappuccino", "Coffeinopia Bogor", "Delivery", R.drawable.cafecito),
            Order("Americano", "Coffeinopia Bogor", "Delivery", R.drawable.cafecito),
                    Order("Americano", "Coffeinopia Bogor", "Delivery", R.drawable.cafecito)
        )

        // Configuración del RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = OrderAdapter(orders)

        val buttonBack: ImageButton = findViewById(R.id.btn_back)

        buttonBack.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}