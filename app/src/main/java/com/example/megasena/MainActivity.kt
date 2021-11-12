package com.example.megasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gerarAposta(){
        val numeros = findViewById<TextView>(R.id.numerosSorteados)
        numeros.text = sortearNumeros().toString()
    }

    private fun sortearNumeros():ArrayList<Int>{
        val numeros = ArrayList<Int>()
        while(numeros.size <7){
            val numero = Math.random().toInt()*60+1
            if(numero in numeros){
                continue
            }
            numeros.add(numero)
        }
        return numeros
    }
}