package edu.bo.projectrocket

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "answer_table")
class Answer(@ColumnInfo(name = "answer") var answer: String,
             @ColumnInfo(name = "type") var  type: String
)
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_answer")
    var id: Long = 0
}