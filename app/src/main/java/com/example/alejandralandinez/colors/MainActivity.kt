package com.example.alejandralandinez.colors

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        amarillo.setOnClickListener(this::changeColor)
        azul.setOnClickListener(this::changeColor)
        rojo.setOnClickListener(this::changeColor)

    }


    fun changeColor(view: View){

        when {
            amarillo.isChecked -> img.setImageResource(R.drawable.iconyellow)
            azul.isChecked -> img.setImageResource(R.drawable.iconblue)
            rojo.isChecked -> img.setImageResource(R.drawable.iconred)
        }

    }


}
