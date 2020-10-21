package edu.bo.projectrocket

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image_answer.*
import kotlinx.android.synthetic.main.activity_text_question.*

class ImageAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_answer)

        btnIA2.setOnClickListener(){
            //btnIA2.setBackgroundResource(R.drawable.bg_btn_red)
            btnIA2.setImageResource(R.drawable.bg_btn_red)
        }

        btnIA1.setOnClickListener(){
            btnIA1.setImageResource(R.drawable.bg_btn_primary)
        }

        btnIA3.setOnClickListener(){
            btnIA3.setImageResource(R.drawable.bg_btn_red)
        }

        btnIA4.setOnClickListener(){
            btnIA4.setImageResource(R.drawable.bg_btn_red)
        }
    }
}