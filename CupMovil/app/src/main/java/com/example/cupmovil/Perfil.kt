package com.example.cupmovil

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil)
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
    }
}