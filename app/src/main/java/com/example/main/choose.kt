package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.main.R

class choose : AppCompatActivity() {
    private lateinit var res: TextView
    private lateinit var Purple: CheckBox
    private lateinit var Green: CheckBox
    private lateinit var Orange: CheckBox
    private lateinit var Submit: Button
    private  var name:String = ""
    private  var result:String = ""
    private  var colors:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose)

        name = intent.getStringExtra("name").toString()
        println(name)
        colors = intent.getStringExtra("res").toString()
        println(colors)
        res = findViewById(R.id.selection)
        Purple = findViewById(R.id.blue)
        Green = findViewById(R.id.red)
        Orange = findViewById(R.id.yellow)
        Submit = findViewById(R.id.MIX)
        res.setText("You Chose $colors")
        Purple = findViewById(R.id.blue)
        Green = findViewById(R.id.red)
        Orange = findViewById(R.id.yellow)
        Submit = findViewById(R.id.MIX)
        result = intent.getStringExtra("result").toString()


        Submit.setOnClickListener {

                if(Purple.isChecked && result == "purple" || Green.isChecked && result == "green" || Orange.isChecked && result == "orange" ) {
                    val intent = Intent( this, right::class.java)
                    intent.putExtra("name",name)
                    startActivity(intent)
                }
                else {
                    val intent = Intent( this, wrong::class.java)
                    intent.putExtra("name",name)
                    startActivity(intent)
                }

        }

    }

}