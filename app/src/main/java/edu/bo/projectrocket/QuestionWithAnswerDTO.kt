package edu.bo.projectrocket

data class QuestionWithAnswerDTO(val id:Long,val question: String,val  type: String,val  secccion: String,val  idCorrectAnswer: Long,val imagenurl:Int,val answers:List<Answer>) {

    //var question: String,var  type: String,var  secccion: Long,var  idCorrectAnswer: Long
    /*fun setQuestion(var id:Long,var question: String,var  type: String,var  secccion: Long,var  idCorrectAnswer: Long){

    }*/
    /*fun getAnswers():List<Answer>{
        return answers
    }*/

}