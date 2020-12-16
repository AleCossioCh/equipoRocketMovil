package edu.bo.projectrocket
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import edu.bo.projectrocke.IQuestion_AnswerDAO

//@Database(entities = {Question::class,Answer::class}, version = 2,exportSchema = false)
@Database(entities = arrayOf(Question::class, Answer::class,QuestionWithAnswer::class), version = 1, exportSchema = false)
abstract  class AppRoomDatabase: RoomDatabase()  {

    abstract fun questionDato(): IQuestionDAO
    abstract fun answerDato():IAnswerDAO
    abstract fun question_answerDato():IQuestion_AnswerDAO
    companion object {
        @Volatile
        private var INSTANCE : AppRoomDatabase? = null
        fun getDatabase(context: Context) : AppRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppRoomDatabase::class.java,
                    "version0_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }

}