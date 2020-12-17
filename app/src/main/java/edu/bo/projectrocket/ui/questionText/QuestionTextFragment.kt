package edu.bo.projectrocket.ui.questionText

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.FileUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

import edu.bo.projectrocket.R
import edu.bo.projectrocket.repository.QuestionRepository
import kotlinx.android.synthetic.main.fragment_question_text.*

class QuestionTextFragment:Fragment(){
    private lateinit var questionViewlModel: QuestionViewModel
    var ButtonOnclik: Button? = null
    var listener:ProgresionListener?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val repository = QuestionRepository()
        questionViewlModel = QuestionViewModel(repository)

        questionViewlModel.model.observe(  getViewLifecycleOwner(), Observer(::nextQuestion))
        val view = inflater.inflate(R.layout.fragment_question_text, container, false)
        val buttonOne = view.findViewById<Button>(R.id.buttonAnswer14)
        val buttonTwo = view.findViewById<Button>(R.id.buttonAnswer2)
        val buttonThree = view.findViewById<Button>(R.id.buttonAnswer3)
        val buttonFour = view.findViewById<Button>(R.id.buttonAnswer4)

        buttonOne.setOnClickListener {

            ButtonOnclik = buttonOne
            questionViewlModel.getResponseCorrect(buttonOne.text.toString())
            listener?.nextProgresion()

        }


        buttonTwo.setOnClickListener {

            ButtonOnclik = buttonTwo
            questionViewlModel.getResponseCorrect(buttonTwo.text.toString())
            listener?.nextProgresion()

        }


        buttonThree.setOnClickListener {

            ButtonOnclik = buttonThree
            questionViewlModel.getResponseCorrect(buttonThree.text.toString())
            listener?.nextProgresion()

        }

        buttonFour.setOnClickListener {

            ButtonOnclik = buttonFour
            questionViewlModel.getResponseCorrect(buttonFour.text.toString())
            listener?.nextProgresion()

        }

        /*
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        */

        return view
    }

    fun nextQuestion(model: QuestionViewModel.Question){

        when(model){
            is QuestionViewModel.Question.IsResponseTrue  -> changeFragment(model.response)

        }

    }
    fun changeFragment(responseQuestion:Boolean){


        if(responseQuestion ){
            ButtonOnclik?.setBackgroundResource(R.drawable.bg_btn_primary)
            ButtonOnclik?.setTextColor(Color.parseColor("#F5F6FA"))

        }
        else
        {
            ButtonOnclik?.setBackgroundResource(R.drawable.bg_btn_red)
            ButtonOnclik?.setTextColor(Color.parseColor("#F5F6FA"))
        }



        // here change fragment



    }


    interface  ProgresionListener{
        fun nextProgresion()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as ProgresionListener
    }

}