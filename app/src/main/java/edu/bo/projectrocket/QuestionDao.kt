package edu.bo.projectrocket

class QuestionDao(var idQ: String,var question:String) {


    fun getQestions(){
        var lista= ArrayList<QuestionDao>()
        lista.add(QuestionDao("123","Que señalizacion es esta"))

    }
}