package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val win_button = findViewById<Button>(R.id.win_button)



        win_button.setOnClickListener {
            //get text from edittexts

            //intent to start activity
            val intent = Intent(this@home, win::class.java)
            startActivity(intent)

        }
    }
}