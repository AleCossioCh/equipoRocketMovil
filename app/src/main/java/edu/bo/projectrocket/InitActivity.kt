package edu.bo.projectrocket

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class InitActivity : AppCompatActivity() {
    var timer: Timer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
        GlobalScope.launch {
            val questionDao = AppRoomDatabase.getDatabase(applicationContext).questionDato()
            val answerDao = AppRoomDatabase.getDatabase(applicationContext).answerDato()
            val relationDao= AppRoomDatabase.getDatabase(applicationContext).question_answerDato()
            val repository = QuesionRepository(questionDao)
            val answerRepository = AnswerRepository(answerDao)
            val relationRepository= QuestionWithAnswerRepository(relationDao)
            val getqwaSeñalizacion = GetQuestionsWithAnswers(repository,relationRepository)

            //val arrayList = ArrayList<Question>()
             /*repository.insertQuestion(Question("¿Que es una vía?", "Texto", "Educacion", 1,R.drawable.ic_walking_foreground))
             repository.insertQuestion(Question("¿Cuales son las partes de una vía?", "Texto", "Educacion", 4,R.drawable.ic_walking_foreground))
             repository.insertQuestion(Question("¿Cómo se clasifican las vías?", "Texto", "Educacion", 7,R.drawable.ic_walking_foreground))
*/
            /* repository.insertQuestion(Question("¿Que es una vía?", "Texto", "Educacion", 1,0))
             repository.insertQuestion(Question("¿Cuales son las partes de una vía?", "Texto", "Educacion", 4,0))
             repository.insertQuestion(Question("¿Cómo se clasifican las vías?", "Texto", "Educacion", 7,0))


             answerRepository.insertAnswer(Answer("Lugar acondicionado para la circulación de vehículos(Art. 46 del reg. del Cód. de Tránsito)","Texto"))
             answerRepository.insertAnswer(Answer("Una vía es donde transitan personas, vehículos y otros","Texto"))
             answerRepository.insertAnswer(Answer("Es donde solo transitan personas","Texto"))
             answerRepository.insertAnswer(Answer("a)Construcciones  laterales b)la acera c)calzada para vehículos","Texto"))
             answerRepository.insertAnswer(Answer("a)Zona peatonal b)Señalización c) Paso de cebra","Texto"))
             answerRepository.insertAnswer(Answer("a)Zona de vehículos b) Señalización c) Semaforo","Texto"))
             answerRepository.insertAnswer(Answer("a)Vía rural    b)Vía urbana","Texto"))
             answerRepository.insertAnswer(Answer("a)Vía vehicular b)Via peatonal","Textp"))
             answerRepository.insertAnswer(Answer("a)Via vehicular b)via urbana","Texto"))

             relationRepository.insertQuestion(1,3)
             relationRepository.insertQuestion(1,2)
             relationRepository.insertQuestion(1,1)
             relationRepository.insertQuestion(2,4)
             relationRepository.insertQuestion(2,5)
             relationRepository.insertQuestion(2,6)
             relationRepository.insertQuestion(3,7)
             relationRepository.insertQuestion(3,8)
             relationRepository.insertQuestion(3,9)*/
            //answerRepository.insertAnswer(Answer("No fumar","imagen"))
            //answerRepository.insertAnswer(Answer("Señalizacion","Texto"))
           // answerRepository.insertAnswer(Answer("No adelentar","Texto"))

           // relationRepository.insertQuestion(1,5)
            //relationRepository.insertQuestion(1,6)

            val listifAnswers=getqwaSeñalizacion.getEducacion()


           // val listaEducacion=getqwaSeñalizacion.getANswersOfSeccion("Educacion")
            //relationRepository.deleteQuestion(1)
            //val listaRelaciones=relationRepository.getAnswersOfQuestion(3)
            //val lista = repository.getListQuestions()
            //val answerlist = answerRepository.getListAnswer()
            //val answers=relationRepository.getANswersOfOneQuestion(1)
            /*listaEducacion.forEach {
                Log.d(
                    "QUESTIONS OF EDUCACION",
                    "Id Question = ${it.id}, Question:${it.question}, Type:${it.type},Seccion:${it.secccion},correctAnswer:${it.idCorrectAnswer}"
                )
            }
            answerlist.forEach{
                print("id:" + it.id  + "Answer: " + it.answer + "Type: " + it.type )
                Log.d(
                    "ANSWERS",
                    "Id Answer = ${it.id},Answer: ${it.answer},Type: ${it.type}"
                )
            }
*/
           /* listaRelaciones.forEach{
                //print("RELACIONES   id:" + it.id  + "questionis: " + it.id_question + "answerid: " + it.id_answer )
                Log.d(
                    "RELACIONES",
                    "Id id = ${it.id},questionis: ${it.id_question},answerid: ${it.id_answer}"
                )
            }*/
            listifAnswers.forEach{
                Log.d(
                    "QUESTIONDTO",
                    "Id Question = ${it.id},Question: ${it.question},Type: ${it.type},Imageurl : ${it.imagenurl}, Answers: ${it.answers.forEach { 
                        Log.d(
                            "ANSWERS",
                            "answer: ${it.answer}, type: ${it.type}"
                        )
                        
                    }}"
                )
            }

        }

        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@InitActivity, ActivityHomeMenu::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)


    }
}