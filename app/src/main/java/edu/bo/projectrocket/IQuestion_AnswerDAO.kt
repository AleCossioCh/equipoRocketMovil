package edu.bo.projectrocke

import androidx.room.*
import edu.bo.projectrocket.Answer
import edu.bo.projectrocket.QuestionWithAnswer
import edu.bo.projectrocket.Question

@Dao
interface IQuestion_AnswerDAO {
    @Query("SELECT * from question_answer_table")
    fun loadQuestionandAnswers(): List<QuestionWithAnswer>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertboth(questionWithAnswer: QuestionWithAnswer)

    @Query("SELECT * from question_answer_table"+" WHERE question_answer_table.id_question = :id_question")
    fun getAnswers(id_question:Long):List<QuestionWithAnswer>

    @Query("SELECT question_answer_table.id_answer from question_answer_table"+" WHERE question_answer_table.id_question = :id_question")
    fun getAnswersId(id_question:Long):List<Long>

    @Query("DELETE FROM question_answer_table WHERE id IN (:id)")
    fun deleteOneRelation(id:Long)

    @Query("SELECT * from answer_table"+" WHERE answer_table.id_answer IN (:answers)")
    fun getAnswersText(answers:List<Long>):List<Answer>


}
