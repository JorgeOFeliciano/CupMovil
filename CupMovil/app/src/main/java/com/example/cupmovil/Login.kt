package com.example.cupmovil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Login : AppCompatActivity() {
    private lateinit var buttonnLogin: Button
    private lateinit var buttonSignUp: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonnLogin = findViewById(R.id.login_button)
        buttonSignUp = findViewById(R.id.sign_up)

        buttonnLogin.setOnClickListener {
            // Iniciar la actividad de la opción 5
            val intent = Intent(this, Nosotros::class.java)
            startActivity(intent)
        }

        buttonSignUp.setOnClickListener {
            // Iniciar la actividad de la opción 5
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }
    }

}