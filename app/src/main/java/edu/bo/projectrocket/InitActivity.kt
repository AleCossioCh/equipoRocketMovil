package edu.bo.projectrocket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class InitActivity : AppCompatActivity() {
    var timer: Timer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)


        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@InitActivity, ActivityHomeMenu::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)


    }
}