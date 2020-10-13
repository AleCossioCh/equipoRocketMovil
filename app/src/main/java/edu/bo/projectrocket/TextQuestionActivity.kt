package edu.bo.projectrocket

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_question.*

class TextQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_question)



        buttonAnswer1.setOnClickListener(){
            buttonAnswer1.setBackgroundResource(R.color.colorButtonWrong)
            buttonAnswer1.setTextColor(Color.parseColor("#FFFFFF"))
        }

        buttonAnswer2.setOnClickListener(){
            buttonAnswer2.setBackgroundResource(R.color.colorButtonRigth)
            buttonAnswer1.setTextColor(Color.parseColor("#FFFFFF"))
        }

        buttonAnswer3.setOnClickListener(){
            buttonAnswer3.setBackgroundResource(R.color.colorButtonWrong)
            buttonAnswer1.setTextColor(Color.parseColor("#FFFFFF"))
        }

        buttonAnswer4.setOnClickListener(){
            buttonAnswer4.setBackgroundResource(R.color.colorButtonWrong)
            buttonAnswer1.setTextColor(Color.parseColor("#FFFFFF"))
        }
    }
}