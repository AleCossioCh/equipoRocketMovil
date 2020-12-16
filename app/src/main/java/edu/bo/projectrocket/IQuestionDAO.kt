package edu.bo.projectrocket;
import androidx.room.*

@Dao
interface IQuestionDAO {
    @Query("SELECT * FROM question_table")
    fun loadQuestions(): List<Question?>

    @Query("SELECT * FROM question_table")
    fun getAllQuestions(): List<Question>

    @Query("SELECT * FROM question_table WHERE question_table.secccion = :secccion")
    fun getQuestionsOf(secccion:String): List<Question>

    @Query("SELECT * FROM question_table ORDER BY random() LIMIT 10")
    fun get10RandomQuestions(): List<Question>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertQuestion( question: Question)

    @Query("DELETE FROM question_table WHERE id_question IN (:id_question)")
    fun deleteOneQuestion(id_question:Int)
}