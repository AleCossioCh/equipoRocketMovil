package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuizImgRes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_img_res)
        val home_button = findViewById<Button>(R.id.home_button)



        home_button.setOnClickListener {
            //get text from edittexts

            //intent to start activity
            val intent = Intent(this@QuizImgRes, home::class.java)
            startActivity(intent)

        }
    }
}