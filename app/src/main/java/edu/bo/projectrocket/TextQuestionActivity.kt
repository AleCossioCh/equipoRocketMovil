package edu.bo.projectrocket

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.Observer
import edu.bo.projectrocket.repository.QuestionRepository
import edu.bo.projectrocket.ui.questionText.QuestionTextFragment
import edu.bo.projectrocket.ui.questionText.QuestionViewModel
import kotlinx.android.synthetic.main.activity_image_question.*
import kotlinx.android.synthetic.main.activity_text_question.*
import kotlinx.android.synthetic.main.content_main.*

class TextQuestionActivity : AppCompatActivity(), QuestionTextFragment.ProgresionListener {
    lateinit var questionViewlModel: QuestionViewModel

    var numberProgression = 1
    var progression:TextView?=null
    var progressBar:ProgressBar?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_question)


        progression = findViewById(R.id.progressIndicator)
        progressBar = findViewById(R.id.progressBar)
        /*
        buttonAnswer1.setOnClickListener(){
           // buttonAnswer1.setBackgroundColor(Color.parseColor("#F5F6FA"))
            buttonAnswer1.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer1.setTextColor(Color.parseColor("#F5F6FA"))
        }

        buttonAnswer2.setOnClickListener(){
            buttonAnswer2.setBackgroundResource(R.drawable.bg_btn_primary)
            buttonAnswer2.setTextColor(Color.parseColor("#F5F6FA"))
            val intent = Intent(this@TextQuestionActivity, WinActivity::class.java)
            startActivity(intent)
        }

        buttonAnswer3.setOnClickListener(){
            //buttonAnswer3.setBackgroundColor(Color.parseColor("#F5F6FA"))
            buttonAnswer3.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer3.setTextColor(Color.parseColor("#F5F6FA"))

        }

        buttonAnswer4.setOnClickListener(){
            buttonAnswer4.setBackgroundResource(R.drawable.bg_btn_red)
            buttonAnswer4.setTextColor(Color.parseColor("#F5F6FA"))

        }

         */

    }

    override fun nextProgresion() {

        if(numberProgression ==10)
        {
            changetoActivityWin()
        }
        else
        {
            numberProgression = numberProgression+1
            progression?.text = numberProgression.toString() + "/10"
            progressBar?.progress = numberProgression *10
            replaceFragment()

        }




    }

    fun changetoActivityWin()
    {
        val intent = Intent(this@TextQuestionActivity, WinActivity::class.java)
        startActivity(intent)

    }

    fun replaceFragment()
    {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragmentoText = QuestionTextFragment()
        fragmentTransaction.replace(R.id.questionFragment,fragmentoText)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }


}