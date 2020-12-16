package edu.bo.projectrocket.ui.questionText

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.bo.projectrocket.repository.QuestionRepository

class QuestionViewModel(val questionRepository: QuestionRepository):ViewModel() {
    val model : LiveData<Question>
        get() = _model
    private val _model  = MutableLiveData<Question>()



    sealed class Question{
        class IsResponseTrue(val response:Boolean):Question()
    }
    fun getRwsponseCorrect(responseQuestion:String){
        _model.value = Question.IsResponseTrue(questionRepository.getResponseTrue(responseQuestion))


    }



}


