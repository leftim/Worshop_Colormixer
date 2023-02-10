package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.main.R

class MainActivity : AppCompatActivity() {



     lateinit var Fullname: EditText
    private lateinit var Yellow: CheckBox
    private lateinit var Mix: Button
    private lateinit var Blue: CheckBox
    private lateinit var Red: CheckBox

    var result:String = ""
    var res:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Fullname = findViewById(R.id.fullname)
        Yellow = findViewById(R.id.yellow)


        Mix = findViewById(R.id.MIX)
        Blue = findViewById(R.id.blue)
        Red = findViewById(R.id.red)
        Mix.setOnClickListener{
                if (Blue.isChecked && Red.isChecked) {
                    res = "Blue and Red"
                    result = "purple"
                }
                if (Yellow.isChecked && Red.isChecked) {
                    res = "Yellow and Red"
                    result = "orange"
                }
                if (Blue.isChecked && Yellow.isChecked) {
                    res = "Blue and Yellow"
                    result = "green"
                }
                val intent = Intent( this, choose::class.java)
                intent.putExtra("result",result)

            intent.putExtra("res",res)



                intent.putExtra("name",Fullname.text.toString())

                startActivity(intent)

        }



    }
}