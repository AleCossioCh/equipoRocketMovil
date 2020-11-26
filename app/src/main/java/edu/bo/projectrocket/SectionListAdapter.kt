package edu.bo.projectrocket

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.section_row.view.*

class SectionListAdapter():
    RecyclerView.Adapter<SectionListAdapter.SectionListViewHolder>() {

    val items = arrayListOf<Section>()

    init {
        items.add(Section("Educacion Vial", "100%", R.drawable.ic_walking_foreground))
        items.add(Section("Normas de circulacion", "80%", R.drawable.ic_strafic_foreground))
        items.add(Section("Señalizacion y accidentes", "70%", R.drawable.ic_right_foreground))
        items.add(Section("Legislacion boliviana", "60%", R.drawable.ic_leg_bol_foreground))
        items.add(Section("Primeros auxilios", "80%", R.drawable.ic_security_foreground))
        items.add(Section("Mecanica Basica", "90%", R.drawable.ic_herramientatuerca_foreground))

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.section_row, parent, false)
        return SectionListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: SectionListViewHolder, position: Int) {
        val section = items.get(position)
        holder.itemView.textViewName.text = section.name
        holder.itemView.textViewProgress.text = section.progress
        holder.itemView.my_image_view.setImageResource(section.image)

        /*holder.itemView.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TextQuestionActivity::class.java)
            startActivity(intent)
        })*/
    }

    class SectionListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}