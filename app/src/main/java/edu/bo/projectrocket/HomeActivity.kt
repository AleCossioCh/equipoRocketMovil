package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        educacionVial.setOnClickListener{
                val intent = Intent(this@HomeActivity, ImageQuestionActivity::class.java)
                startActivity(intent)
        }
        normasdeCirculacion.setOnClickListener {
            val intent = Intent(this@HomeActivity, TextQuestionActivity::class.java)
            startActivity(intent)
        }
        idcalendar.setOnClickListener{
            val intent = Intent(this@HomeActivity, CalendarActivity::class.java)
            startActivity(intent)

        }
    }
}