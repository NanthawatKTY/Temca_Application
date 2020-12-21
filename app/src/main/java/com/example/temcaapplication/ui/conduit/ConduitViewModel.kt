package com.example.temcaapplication.ui.conduit

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ConduitViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is conduit Fragment"
    }
    val text: LiveData<String> = _text
}