package edu.bo.projectrocket.ui.gallery

import android.widget.DatePicker
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.bo.projectrocket.R

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selecciona la fecha para tu examen de conducción"
    }
    val text: LiveData<String> = _text



}