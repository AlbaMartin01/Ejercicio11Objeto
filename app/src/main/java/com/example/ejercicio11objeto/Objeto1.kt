package com.example.ejercicio11objeto

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Objeto1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objeto1)

        var obj = Objeto(5, 10, 20)

        var personaje1 = Jugador("Juan")

        var dado = (1..2).random()
        if (dado == 1) {
            findViewById<ImageView>(R.id.imagenObjeto).setImageResource(R.drawable.piedra)
        } else if (dado == 2){
            findViewById<ImageView>(R.id.imagenObjeto).setImageResource(R.drawable.espada)
        }

        findViewById<Button>(R.id.botonRecoger).setOnClickListener {
            personaje1.mochila.addObjeto(obj, applicationContext)
            var intento = Intent(this, Siguiente::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.botonContinuar).setOnClickListener {
            var intento = Intent(this, MainActivity::class.java)
            startActivity(intento)
        }

    }
}