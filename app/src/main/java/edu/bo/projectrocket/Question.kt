package edu.bo.projectrocket;

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "question_table")
class Question(@ColumnInfo(name = "question") var question: String,
               @ColumnInfo(name = "type") var  type: String,
               @ColumnInfo(name = "secccion") var  secccion: String,
               @ColumnInfo(name = "idCorrectAnswer") var  idCorrectAnswer: Long,
               @ColumnInfo(name = "imageurl")var imageurl:Int
)
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_question")
    var id: Long = 0


}
