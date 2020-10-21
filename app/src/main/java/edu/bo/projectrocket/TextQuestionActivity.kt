package edu.bo.projectrocket

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image_question.*
import kotlinx.android.synthetic.main.activity_text_question.*

class TextQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_question)



        buttonAnswer1.setOnClickListener(){
           // buttonAnswer1.setBackgroundColor(Color.parseColor("#F5F6FA"))
            buttonAnswer1.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer1.setTextColor(Color.parseColor("#F5F6FA"))
        }

        buttonAnswer2.setOnClickListener(){
            buttonAnswer2.setBackgroundResource(R.drawable.bg_btn_primary)
            buttonAnswer2.setTextColor(Color.parseColor("#F5F6FA"))

        }

        buttonAnswer3.setOnClickListener(){
            //buttonAnswer3.setBackgroundColor(Color.parseColor("#F5F6FA"))
            buttonAnswer3.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer3.setTextColor(Color.parseColor("#F5F6FA"))

        }

        buttonAnswer4.setOnClickListener(){
            //buttonAnswer4.setBackgroundColor(Color.parseColor("#F5F6FA"))
            buttonAnswer4.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer4.setTextColor(Color.parseColor("#F5F6FA"))

        }
    }
}