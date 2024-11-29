package com.example.cupmovil.Admin

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
import com.example.cupmovil.Nosotros
import com.example.cupmovil.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Admin_Compras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_admin_compras)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val RecyclerView1  = findViewById<RecyclerView>(R.id.recycler_view_orders)

        val order = listOf(
            Order("Jorge", "", "Cliente", R.drawable.profile_image),
            Order("David", "", "Cliente", R.drawable.profile_image),
            Order("Edgar", "", "Cliente", R.drawable.profile_image),
            Order("Victor", "", "Cliente", R.drawable.profile_image),
            Order("Roy", "", "Cliente", R.drawable.profile_image)
        )

        RecyclerView1.layoutManager = LinearLayoutManager(this)
        RecyclerView1.adapter = OrderAdapter(order)

        // Configurar los FAB
        val fabOption1: FloatingActionButton = findViewById(R.id.fab_option1)
        val fabOption2: FloatingActionButton = findViewById(R.id.fab_option2)
        val fabOption3: FloatingActionButton = findViewById(R.id.fab_option3)
        val fabOption4: FloatingActionButton = findViewById(R.id.fab_option4)
        val buttonnBack: ImageButton = findViewById(R.id.btn_back)

        fabOption1.setOnClickListener {
            val intent = Intent(this, AdminUsuarios::class.java)
            startActivity(intent)
        }

        fabOption2.setOnClickListener {
            val intent = Intent(this, Admin_Compras::class.java)
            startActivity(intent)
        }

        fabOption3.setOnClickListener {
            val intent = Intent(this, Admin_Comentarios::class.java)
            startActivity(intent)
        }

        fabOption4.setOnClickListener {
            val intent = Intent(this, Admin_Inventario::class.java)
            startActivity(intent)
        }

        buttonnBack.setOnClickListener{
            val intent = Intent(this, Nosotros::class.java)
            startActivity(intent)
        }
    }
}