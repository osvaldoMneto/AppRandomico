package com.example.ads_calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSalvar = this.findViewById<Button>(R.id.btnSalvar)

        btnSalvar.setOnClickListener {

            val intent = Intent(this,
                SingUpActivity::class.java)

            val txtEmail = this.findViewById<EditText>(R.id.txtEmail)
            intent.putExtra("email", txtEmail.text.toString())

            val txtName = this.findViewById<EditText>(R.id.txtName)
            intent.putExtra("nome", txtName.text.toString())

            this.startActivity(intent)


        }

    }
}