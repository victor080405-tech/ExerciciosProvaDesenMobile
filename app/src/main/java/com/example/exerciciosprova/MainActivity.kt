package com.example.exerciciosprova

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editLarguraA = findViewById<EditText>(R.id.editLarguraA)
        val editAlturaA = findViewById<EditText>(R.id.editAlturaA)
        val txtPerimetro = findViewById<TextView>(R.id.txtPerimetro)
        val txtArea = findViewById<TextView>(R.id.txtArea)
        val btnCalcularArea = findViewById<Button>(R.id.btnCalcularArea)

        val editTempo = findViewById<EditText>(R.id.editTempo)
        val editVelocidade = findViewById<EditText>(R.id.editVelocidade)
        val editMedia = findViewById<EditText>(R.id.editMedia)
        val txtCombustivel = findViewById<TextView>(R.id.txtCombustivel)
        val btnCalcularCombustivel = findViewById<Button>(R.id.btnCalcularCombustivel)

        btnCalcularArea.setOnClickListener {
            val largura = editLarguraA.text.toString().toDoubleOrNull() ?: 0.0
            val altura = editAlturaA.text.toString().toDoubleOrNull() ?: 0.0

            val area = largura * altura
            val perimetro = 2 * (largura + altura)

            txtArea.text = String.format("%.2f", area)
            txtPerimetro.text = String.format("%.2f", perimetro)
        }

        btnCalcularCombustivel.setOnClickListener {
            val tempo = editTempo.text.toString().toDoubleOrNull() ?: 0.0
            val velocidade = editVelocidade.text.toString().toDoubleOrNull() ?: 0.0
            val media = editMedia.text.toString().toDoubleOrNull() ?: 1.0

            val distancia = tempo * velocidade
            val litrosUsados = distancia / media

            txtCombustivel.text = String.format("%.2f", litrosUsados)
        }
    }
}