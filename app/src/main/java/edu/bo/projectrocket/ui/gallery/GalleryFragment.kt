package edu.bo.projectrocket.ui.gallery

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import edu.bo.projectrocket.R
import kotlinx.android.synthetic.main.fragment_gallery.*
import java.lang.reflect.Array.newInstance
import java.util.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val now = Calendar.getInstance()
        val currentYear: Int = now.get(Calendar.YEAR)
        val currentMonth: Int = now.get(Calendar.MONTH)
        val currentDay: Int = now.get(Calendar.DAY_OF_MONTH)

        galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.QuestionTextView)
        val but: Button = root.findViewById(R.id.confirmDate)
        val datePick: DatePicker = root.findViewById(R.id.datePicker1)



        but.setOnClickListener {
            val day = datePick.dayOfMonth
            val month = datePick.month
            val year = datePick.year
            Log.d("Date", "Day = ${day}")
            Log.d("Date", "Month = ${month}")
            Log.d( "Date", "Month = ${year}")
        }


        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }




}