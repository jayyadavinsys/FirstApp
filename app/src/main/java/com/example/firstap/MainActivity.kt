package com.example.firstap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        //enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        var button =findViewById<Button>(R.id.btn_1)
        button.setOnClickListener {
            var Intent = Intent(this, Main2Activity::class.java)
            startActivity(Intent)
        }
Log.d( "MainActivity", "OnCreate Method call succesfully")
    }


}