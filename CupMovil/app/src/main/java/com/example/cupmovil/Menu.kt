package com.example.cupmovil

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cupmovil.menu.ProductoAlitas
import com.example.cupmovil.menu.ProductoCafe
import com.example.cupmovil.menu.ProductoCerveza
import com.example.cupmovil.menu.ProductoHamburguesa
import com.example.cupmovil.menu.ProductoPizza
import com.example.cupmovil.menu.ProductoPoste
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Menu : AppCompatActivity() {

    private lateinit var cafeButton: ImageButton
    private lateinit var pizzaButton: ImageButton
    private lateinit var wingsButton: ImageButton
    private lateinit var burgerButton: ImageButton
    private lateinit var beerButton: ImageButton
    private lateinit var dessertButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menus)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Obtener los botones FAB por su ID
        val fabOption1: FloatingActionButton = findViewById(R.id.fab_option1)
        val fabOption2: FloatingActionButton = findViewById(R.id.fab_option2)
        val fabOption3: FloatingActionButton = findViewById(R.id.fab_option3)
        val fabOption4: FloatingActionButton = findViewById(R.id.fab_option4)
        val fabOption5: FloatingActionButton = findViewById(R.id.fab_option5)

        val imageButtonStore = findViewById<ImageButton>(R.id.imageButtonStore)

        // Obtener los botones de categorías por su ID
        cafeButton = findViewById(R.id.btnCoffee)
        pizzaButton = findViewById(R.id.btnPizza)
        wingsButton = findViewById(R.id.btnWings)
        burgerButton = findViewById(R.id.btnHamburguesa)
        beerButton = findViewById(R.id.btnPCervezas)
        dessertButton = findViewById(R.id.btnPostre)

        // Establecer un OnClickListener para cada FAB
        fabOption1.setOnClickListener {
            // Iniciar la actividad de la opción 1
            val intent = Intent(this, Especiales::class.java)
            startActivity(intent)
        }

        fabOption2.setOnClickListener {
            // Iniciar la actividad de la opción 2
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        fabOption3.setOnClickListener {
            // Iniciar la actividad de la opción 3
            val intent = Intent(this, Nosotros::class.java)
            startActivity(intent)
        }

        fabOption4.setOnClickListener {
            // Iniciar la actividad de la opción 4
            val intent = Intent(this, Reservacion::class.java)
            startActivity(intent)
        }

        fabOption5.setOnClickListener {
            // Iniciar la actividad de la opción 5
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }

        cafeButton.setOnClickListener {
            val intent = Intent(this, ProductoCafe::class.java)
            startActivity(intent)
        }

        pizzaButton.setOnClickListener {
            val intent = Intent(this, ProductoPizza::class.java)
            startActivity(intent)
        }

        wingsButton.setOnClickListener {
            val intent = Intent(this, ProductoAlitas::class.java)
            startActivity(intent)
        }

        burgerButton.setOnClickListener {
            val intent = Intent(this, ProductoHamburguesa::class.java)
            startActivity(intent)
        }

        beerButton.setOnClickListener {
            val intent = Intent(this, ProductoCerveza::class.java)
            startActivity(intent)
        }

        dessertButton.setOnClickListener {
            val intent = Intent(this, ProductoPoste::class.java)
            startActivity(intent)
        }

        imageButtonStore.setOnClickListener {
            val intent = Intent(this, Carrito::class.java)
            startActivity(intent)
        }




    }
}