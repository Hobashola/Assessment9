package com.hobashola.assessment9.ui.my_friends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class My_FriendsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my_friends Fragment"
    }
    val text: LiveData<String> = _text
}