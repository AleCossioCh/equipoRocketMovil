package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        /*
        val lista = arrayListOf<Section>()
        lista.add(Section("Educacion Vial", "100%",R.drawable.ic_walking_foreground))
        lista.add(Section("Normas de circulacion", "80%",R.drawable.ic_strafic_foreground))
        lista.add(Section("Señalizacion y accidentes", "70%",R.drawable.ic_right_foreground))
        lista.add(Section("Legislacion boliviana", "60%",R.drawable.ic_leg_bol_foreground))
        lista.add(Section("Primeros auxilios", "80%",R.drawable.ic_security_foreground))
        lista.add(Section("Mecanica Basica", "90%",R.drawable.ic_herramientatuerca_foreground))

        val sectionListAdapter = SectionListAdapter(lista, this)
        recycleViewSection.adapter = sectionListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleViewSection.layoutManager = linearLayoutManager

        */
        }
 

}