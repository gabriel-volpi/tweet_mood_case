package com.example.tweet_mood.presetation.find_user

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModel @ViewModelInject constructor() : ViewModel() {

    init {
        Log.d("viewModel", "Testing Dependency injection with hilt")
    }
}