package edu.bo.projectrocket

import androidx.room.*

@Entity(tableName = "question_answer_table")
class QuestionWithAnswer(@ColumnInfo(name = "id_question") var id_question: Long,
                            @ColumnInfo(name = "id_answer") var  id_answer: Long) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0

}