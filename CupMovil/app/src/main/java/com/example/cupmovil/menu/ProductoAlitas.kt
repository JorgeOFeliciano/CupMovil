package com.example.cupmovil.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cupmovil.Carrito
import com.example.cupmovil.Menu
import com.example.cupmovil.Nosotros
import com.example.cupmovil.R

class ProductoAlitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_producto_alitas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack: ImageButton = findViewById(R.id.btn_back)

        btnBack.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        val imageButtonStore = findViewById<Button>(R.id.btnStore)
        imageButtonStore.setOnClickListener {
            val intent = Intent(this, Carrito::class.java)
            startActivity(intent)
        }

    }
}