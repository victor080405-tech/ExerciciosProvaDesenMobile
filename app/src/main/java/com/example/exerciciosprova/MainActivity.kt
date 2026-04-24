package com.example.exerciciosprovadesenmobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editLarguraA = findViewById<EditText>(R.id.editLarguraA)
        val editLarguraB = findViewById<EditText>(R.id.editLarguraB)
        val textPerimetro = findViewById<TextView>(R.id.textPerimetro)
        val textArea = findViewById<TextView>(R.id.textArea)
        val btnCalcularArea = findViewById<Button>(R.id.btnCalcularArea)

        val editTempoGasto = findViewById<EditText>(R.id.editTempoGasto)
        val editVelocidadeMedia = findViewById<EditText>(R.id.editVelocidadeMedia)
        val editMediaConsumo = findViewById<EditText>(R.id.editMediaConsumo)
        val textCombustivelUsado = findViewById<TextView>(R.id.textCombustivelUsado)
        val btnCalcularCombustivel = findViewById<Button>(R.id.btnCalcularCombustivel)

        btnCalcularArea.setOnClickListener {
            val larguraA = editLarguraA.text.toString().toDoubleOrNull() ?: 0.0
            val larguraB = editLarguraB.text.toString().toDoubleOrNull() ?: 0.0

            val area = larguraA * larguraB
            val perimetro = 2 * (larguraA + larguraB)

            textArea.text = String.format("%.2f", area)
            textPerimetro.text = String.format("%.2f", perimetro)
        }

        btnCalcularCombustivel.setOnClickListener {
            val tempo = editTempoGasto.text.toString().toDoubleOrNull() ?: 0.0
            val velocidade = editVelocidadeMedia.text.toString().toDoubleOrNull() ?: 0.0
            val mediaKml = editMediaConsumo.text.toString().toDoubleOrNull() ?: 1.0

            val distancia = tempo * velocidade
            val litrosUsados = distancia / mediaKml

            textCombustivelUsado.text = String.format("%.2f", litrosUsados)
        }
    }
}
