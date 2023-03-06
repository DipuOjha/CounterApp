package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   lateinit var button: Button
    lateinit var textview:TextView
     var counter:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        setCounter()
    }
    fun init(){
       // counter=0
        button = findViewById(R.id.button)
        textview = findViewById(R.id.textvw)
        textview.text= counter.toString()
    }
    fun setCounter() {
        button?.setOnClickListener() {
            counter++;
            textview.text = counter.toString();
        }
    }

    override fun onPause() {
        super.onPause()
        counter=0

    }

    override fun onResume() {
        super.onResume()
        setCounter()
    }

    }
