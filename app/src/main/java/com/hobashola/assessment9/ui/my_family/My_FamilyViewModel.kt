package com.hobashola.assessment9.ui.my_family

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class My_FamilyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my_family Fragment"
    }
    val text: LiveData<String> = _text
}