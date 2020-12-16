package edu.bo.projectrocket

import edu.bo.projectrocke.IQuestion_AnswerDAO
import kotlinx.coroutines.joinAll

class QuestionWithAnswerRepository (private val iquestionAnswerdao: IQuestion_AnswerDAO){
    fun insertQuestion(question: Long,answer: Long) {
        //QuestionWithAnswer(id_question,id_answer)
         var qs : QuestionWithAnswer = QuestionWithAnswer(question,answer)
        iquestionAnswerdao.insertboth(qs)
    }
    fun getListQuestions(): List<QuestionWithAnswer>{
        return iquestionAnswerdao.loadQuestionandAnswers()
    }

    fun getAnswersOfQuestion(id:Long):List<QuestionWithAnswer>{
        return iquestionAnswerdao.getAnswers(id)
    }
    fun deleteQuestion(int:Long){
        iquestionAnswerdao.deleteOneRelation(int)
        print("borrado exitoso : $int")
    }
    fun getANswersOfOneQuestion(int:Long):List<Answer>{
        val lista=iquestionAnswerdao.getAnswersId(int)
        return iquestionAnswerdao.getAnswersText(lista)
    }

}