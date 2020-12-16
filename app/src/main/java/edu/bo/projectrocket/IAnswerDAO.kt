package edu.bo.projectrocket
import androidx.room.*

@Dao
interface IAnswerDAO {
    @Query("SELECT * FROM answer_table")
    fun loadAnswers(): List<Answer>

    @Query("SELECT * FROM answer_table")
    fun getAllAnswers(): List<Answer>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAnswer( answer: Answer)

    @Query("DELETE FROM answer_table WHERE id_answer IN (:id_answer)")
    fun deleteOneAnswer(id_answer:Int)
}