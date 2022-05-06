package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var quoteText = MutableLiveData("What you do you will get it")
    var imageUrl = "https://picsum.photos/200"

    fun updateQuote() {
        quoteText.value = "You deserve best what you did."
    }


}