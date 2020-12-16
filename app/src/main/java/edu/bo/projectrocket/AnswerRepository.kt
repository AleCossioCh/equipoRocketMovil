package edu.bo.projectrocket

class AnswerRepository(private val iAnswerDAO: IAnswerDAO) {
    fun insertAnswer(answer: Answer) {
        iAnswerDAO.insertAnswer(answer)
    }
    fun getListAnswer(): List<Answer> {
        return iAnswerDAO.getAllAnswers()
    }
    fun deleteAnswer(int:Int){
        iAnswerDAO.deleteOneAnswer(int)
        print("borrado exitoso : $int")
    }

}