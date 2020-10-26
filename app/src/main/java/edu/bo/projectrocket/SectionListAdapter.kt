package edu.bo.projectrocket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.section_row.view.*

class SectionListAdapter(val items: ArrayList<Section>, val context: Context):
    RecyclerView.Adapter<SectionListAdapter.SectionListViewHolder>() {

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
    }

    class SectionListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}