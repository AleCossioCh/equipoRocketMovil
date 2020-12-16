package edu.bo.projectrocket.ui.questionText

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import edu.bo.projectrocket.R
import edu.bo.projectrocket.ui.home.HomeViewModel

class QuestionTextFragment:Fragment(){
    private lateinit var questionViewlModel: QuestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_question_text, container, false)

        /*
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        */

        return view
    }

}