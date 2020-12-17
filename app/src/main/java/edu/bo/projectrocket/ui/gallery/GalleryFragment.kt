package edu.bo.projectrocket.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import edu.bo.projectrocket.R
import kotlinx.android.synthetic.main.fragment_gallery.*
import java.util.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)


        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.QuestionTextView)

        val today = Calendar.getInstance()

        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })


        return root
    }



}