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
import com.example.cupmovil.Adaptador.ProductoAdaptador
import com.example.cupmovil.DataClass.Producto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Especiales : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_especiales)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencia al RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvProductos1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.rv_ofertas1)

        val imageButtonStore = findViewById<ImageButton>(R.id.imageButtonStore)

        // Crear lista de datos para el RecyclerView
        val productList = listOf(
            Producto("Producto 1", "Descripción del producto 1", R.drawable.fondo_tarjeta1, "$99.99"),
            Producto("Producto 2", "Descripción del producto 2", R.drawable.fondo_tarjeta1, "$199.99")
        )

        // Configurar el RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = ProductoAdaptador(productList)

        val productList2 = listOf(
            Producto("Producto 1", "Descripción del producto 1", R.drawable.fondo_tarjeta1, "$99.99"),
            Producto("Producto 2", "Descripción del producto 2", R.drawable.fondo_tarjeta1, "$199.99")
        )

        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = ProductoAdaptador(productList2)

        // Configurar los FAB
        val fabOption1: FloatingActionButton = findViewById(R.id.fab_option1)
        val fabOption2: FloatingActionButton = findViewById(R.id.fab_option2)
        val fabOption3: FloatingActionButton = findViewById(R.id.fab_option3)
        val fabOption4: FloatingActionButton = findViewById(R.id.fab_option4)
        val fabOption5: FloatingActionButton = findViewById(R.id.fab_option5)

        fabOption1.setOnClickListener {
            val intent = Intent(this, Especiales::class.java)
            startActivity(intent)
        }

        fabOption2.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        fabOption3.setOnClickListener {
            val intent = Intent(this, Nosotros::class.java)
            startActivity(intent)
        }

        fabOption4.setOnClickListener {
            val intent = Intent(this, Reservacion::class.java)
            startActivity(intent)
        }

        fabOption5.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }

        imageButtonStore.setOnClickListener {
            val intent = Intent(this, Carrito::class.java)
            startActivity(intent)
        }
    }
}
