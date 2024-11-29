package com.example.cupmovil

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cupmovil.Adaptador.ProductoAdaptador
import com.example.cupmovil.DataClass.Producto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Reservacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reservacion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencia al RecyclerView
        val RecyclerView1 = findViewById<RecyclerView>(R.id.rvFotos1)
        val RecyclerView2 = findViewById<RecyclerView>(R.id.rvFotos2)
        val RecyclerView3 = findViewById<RecyclerView>(R.id.rvFotos3)
        val RecyclerView4 = findViewById<RecyclerView>(R.id.rvFotos4)
        val RecyclerView5 = findViewById<RecyclerView>(R.id.rvFotos5)

        val fotosJorge = listOf(
            Producto("Planta 1", "Foto1", R.drawable.fondo_tarjeta1, ""),
            Producto("Planta 2", "Foto2", R.drawable.fondo_tarjeta1, ""),
            Producto("Planta 3", "Foto3", R.drawable.fondo_tarjeta1, ""),
            Producto("Planta 4", "Foto4", R.drawable.fondo_tarjeta1, ""),
            Producto("Planta 5", "Foto5", R.drawable.fondo_tarjeta1, "")
        )

        val fotosRoy = listOf(
            Producto("Planta 1", "Foto1", R.drawable.rogelio1, ""),
            Producto("Planta 2", "Foto2", R.drawable.rogelio2, ""),
            Producto("Planta 3", "Foto3", R.drawable.rogelio3, ""),
            Producto("Planta 4", "Foto4", R.drawable.rogelio4, ""),
            Producto("Planta 5", "Foto5", R.drawable.rogelio5, ""),
            Producto("Planta 6", "Foto6", R.drawable.rogelio6, ""),
            Producto("Planta 7", "Foto7", R.drawable.rogelio7, ""),
            Producto("Planta 8", "Foto8", R.drawable.rogelio8, "")
        )

        val fotosEdgar = listOf(
            Producto("Planta 1", "Foto1", R.drawable.edgar_1, ""),
            Producto("Planta 2", "Foto2", R.drawable.edgar_2, ""),
            Producto("Planta 3", "Foto3", R.drawable.edgar_3, ""),
            Producto("Planta 4", "Foto4", R.drawable.edgar_4, ""),
            Producto("Planta 5", "Foto5", R.drawable.edgar_5, ""),
            Producto("Planta 6", "Foto6", R.drawable.edgar_6, ""),
            Producto("Planta 7", "Foto7", R.drawable.edgar_7, ""),
            Producto("Planta 8", "Foto8", R.drawable.edgar_8, ""),
            Producto("Planta 8", "Foto8", R.drawable.edgar_9, ""),
            Producto("Planta 8", "Foto8", R.drawable.edgar_10, "")
        )

        val fotosDavid = listOf(
            Producto("Planta 1", "Foto1", R.drawable.david_1, ""),
            Producto("Planta 2", "Foto2", R.drawable.david_2, ""),
            Producto("Planta 3", "Foto3", R.drawable.david_3, ""),
            Producto("Planta 4", "Foto4", R.drawable.david_4, ""),
            Producto("Planta 5", "Foto5", R.drawable.david_5, ""),
            Producto("Planta 6", "Foto6", R.drawable.david_6, ""),
            Producto("Planta 7", "Foto7", R.drawable.david_7, ""),
            Producto("Planta 8", "Foto8", R.drawable.david_8, ""),
            Producto("Planta 9", "Foto9", R.drawable.david_9, ""),
            Producto("Planta 10", "Foto10", R.drawable.david_10, "")
        )

        val fotosVictor = listOf(
            Producto("Planta 1", "Foto1", R.drawable.victor_1, ""),
            Producto("Planta 2", "Foto2", R.drawable.victor_2, ""),
            Producto("Planta 3", "Foto3", R.drawable.victor_3, ""),
            Producto("Planta 4", "Foto4", R.drawable.victor_4, ""),
            Producto("Planta 5", "Foto5", R.drawable.victor_5, ""),
            Producto("Planta 6", "Foto6", R.drawable.victor_6, ""),
            Producto("Planta 7", "Foto7", R.drawable.victor_7, ""),
            Producto("Planta 8", "Foto8", R.drawable.victor_8, "")
            )

        RecyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView1.adapter = ProductoAdaptador(fotosJorge)

        RecyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView2.adapter = ProductoAdaptador(fotosRoy)

        RecyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView3.adapter = ProductoAdaptador(fotosEdgar)

        RecyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView4.adapter = ProductoAdaptador(fotosDavid)

        RecyclerView5.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView5.adapter = ProductoAdaptador(fotosVictor)

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
    }
}