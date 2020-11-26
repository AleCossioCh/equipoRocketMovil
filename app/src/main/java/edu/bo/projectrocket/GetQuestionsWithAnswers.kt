package edu.bo.projectrocket

import java.util.ArrayList

class GetQuestionsWithAnswers(val quesionRepository: QuesionRepository, val questionWithAnswerRepository: QuestionWithAnswerRepository) {

    fun getSeñalizacion():List<QuestionWithAnswerDTO>{
        //val questionlist=quesionRepository.getListQuestions().shuffled().take(2)
        val questionlist=quesionRepository.getListQuestionsof("Señalizacion")

        val list = arrayListOf<QuestionWithAnswerDTO>()

        questionlist.forEach {
            //val answersList=questionWithAnswerRepository.getAnswersOfQuestion(it.id)
            val answers=questionWithAnswerRepository.getANswersOfOneQuestion(it.id)
            list.add(QuestionWithAnswerDTO(it.id,it.question,it.type,it.secccion,it.idCorrectAnswer,it.imageurl,answers))
        }
        return list;

    }
    ////////////////////////////////////////////
    /*RETORNA LAS PREGUNTAS  Y SUS RESPUESTAS QUE CORRESPONDEN A EDUCACION */
    fun getEducacion():List<QuestionWithAnswerDTO>{
        //val questionlist=quesionRepository.getListQuestions().shuffled().take(2)
        val questionlist=quesionRepository.getListQuestionsof("Educacion")

        val list = arrayListOf<QuestionWithAnswerDTO>()

        questionlist.forEach {
            //val answersList=questionWithAnswerRepository.getAnswersOfQuestion(it.id)
            val answers=questionWithAnswerRepository.getANswersOfOneQuestion(it.id)
            list.add(QuestionWithAnswerDTO(it.id,it.question,it.type,it.secccion,it.idCorrectAnswer,it.imageurl,answers))
        }
        return list;

    }










    fun getANswersOfSeccion(seccion:String):List<Question>{
        return quesionRepository.getListQuestionsof(seccion)
    }

}