package com.schiggzz.ahoh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class LogIn : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogIn: Button
    private lateinit var btnSingUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        edtName = findViewById(R.id.edt_name)
        edtPassword = findViewById(R.id.edt_password)
        btnLogIn = findViewById(R.id.btn_LogIn)
        btnSingUp = findViewById(R.id.btn_SignUp)

        btnSingUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}