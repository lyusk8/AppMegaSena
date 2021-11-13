package com.example.megasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoNumero = findViewById<Button>(R.id.button)
        botaoNumero.setOnClickListener {
            gerarAposta()
        }
    }

    private fun gerarAposta(){
        val numeros = findViewById<TextView>(R.id.numerosSorteados)
        val texto = sortearNumeros().toString()
        numeros.setText(texto)
    }

    private fun sortearNumeros():ArrayList<Int>{
        val numeros = ArrayList<Int>()
        while(numeros.size <7){
            val numero = ((1..60).random())
            if(numero in numeros){
                continue
            }
            numeros.add(numero)
        }
        return numeros
    }
}