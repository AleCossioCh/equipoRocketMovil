package edu.bo.projectrocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val lista = arrayListOf<Section>()
        lista.add(Section("Educacion Vial", "100%"))
        lista.add(Section("Normas de circulacion", "80%"))
        lista.add(Section("Señalizacion y accidentes", "70%"))
        lista.add(Section("Legislacion boliviana", "60%"))
        lista.add(Section("Primeros auxilios", "80%"))
        lista.add(Section("Mecanica Basica", "90%"))

        val sectionListAdapter = SectionListAdapter(lista, this)
        recycleViewSection.adapter = sectionListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleViewSection.layoutManager = linearLayoutManager

    }
}