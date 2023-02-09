package com.example.ejercicio11objeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.botonDado).setOnClickListener {
            var intento = Intent(this, Objeto1::class.java)
            startActivity(intento)
        }
    }
}