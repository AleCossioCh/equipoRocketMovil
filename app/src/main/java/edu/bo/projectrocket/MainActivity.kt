package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val home_button = findViewById<Button>(R.id.home_button)



       /* home_button.setOnClickListener {
            val intent = Intent(this@MainActivity, InitActivity::class.java)
            startActivity(intent)

        }*/
    }
}