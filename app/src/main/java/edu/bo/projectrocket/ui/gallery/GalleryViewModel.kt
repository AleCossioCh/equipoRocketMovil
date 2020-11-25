package edu.bo.projectrocket.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selecciona la fecha para tu examen de conducción"
    }
    val text: LiveData<String> = _text
}