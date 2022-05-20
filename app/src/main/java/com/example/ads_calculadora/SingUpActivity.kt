package com.example.ads_calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        //criaçao da variavel para obter os dados enviados na intent
        val email = intent.getStringExtra("email")
        val nome = intent.getStringExtra("nome")

        //criaçao da variavel para linkar as dados co os objtos na tela
        val txtNomeSignUp = this.findViewById<TextView>(R.id.txtNomeSignUp)
        val txtEmailSignUp = this.findViewById<TextView>(R.id.txtEmailSignUp)

        txtNomeSignUp.setText("Seja Bem-vindo $nome")
        txtEmailSignUp.setText(email)


        var rollButton = this.findViewById<Button>(R.id.rollButton)
        var resultView = this.findViewById<TextView>(R.id.txtResultView)
        var seekBar = this.findViewById<SeekBar>(R.id.seekBar)

       rollButton.setOnClickListener {

           val rand = Random.nextInt(seekBar.progress
           )+1
           resultView.text = rand.toString()

       }
        }
    }
