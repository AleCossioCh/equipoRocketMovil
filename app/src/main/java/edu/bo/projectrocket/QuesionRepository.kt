package edu.bo.projectrocket

class QuesionRepository(private val iQuestionDAO: IQuestionDAO) {
    fun insertQuestion(question: Question) {
        iQuestionDAO.insertQuestion(question)
    }
    fun getListQuestions(): List<Question> {
        return iQuestionDAO.getAllQuestions()
    }
    fun deleteQuestion(int:Int){
        iQuestionDAO.deleteOneQuestion(int)
        print("borrado exitoso : $int")
    }
    fun getListQuestionsof(seccion:String): List<Question>{
        return iQuestionDAO.getQuestionsOf(seccion)
    }
    fun get10RandomQuestions(): List<Question>{
        return iQuestionDAO.get10RandomQuestions()
    }
}