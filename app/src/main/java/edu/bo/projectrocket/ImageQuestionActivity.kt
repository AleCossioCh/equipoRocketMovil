package edu.bo.projectrocket

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_image_question.*

class ImageQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_question)

        idopcionEstacion.setOnClickListener{
            idopcionEstacion.setBackgroundColor(Color.parseColor("#F5F6FA"))
            idopcionEstacion.setBackgroundResource(R.drawable.bg_btn_red)
        }
        idNextView.setOnClickListener {
            val intent = Intent(this@ImageQuestionActivity, MainActivity::class.java)
            startActivity(intent)

        }
    }
}