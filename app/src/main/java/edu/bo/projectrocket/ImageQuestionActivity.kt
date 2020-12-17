package edu.bo.projectrocket

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_image_question.*
import kotlinx.android.synthetic.main.activity_text_question.*

class ImageQuestionActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_question)

        idopcionEstacion.setOnClickListener{
            idopcionEstacion.setBackgroundResource(R.drawable.bg_btn_red)
            idopcionEstacion.setTextColor(Color.parseColor("#F5F6FA"))
        }

        idNextView.setOnClickListener {
            val intent = Intent(this@ImageQuestionActivity, MainActivity::class.java)
            startActivity(intent)

        }

        idopcionGirar.setOnClickListener(){
            idopcionGirar.setBackgroundResource(R.drawable.bg_btn_primary)
            idopcionGirar.setTextColor(Color.parseColor("#F5F6FA"))

        }

        idopcionfumar.setOnClickListener(){
            //buttonAnswer3.setBackgroundColor(Color.parseColor("#F5F6FA"))
            idopcionfumar.setBackgroundResource(R.drawable.bg_btn_red)
            idopcionfumar.setTextColor(Color.parseColor("#F5F6FA"))

        }

        idopcionstop.setOnClickListener(){
            idopcionstop.setBackgroundResource(R.drawable.bg_btn_red)
            idopcionstop.setTextColor(Color.parseColor("#F5F6FA"))

        }
    }
}