package com.example.tweet_mood.presetation.find_user

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    init {
        Log.d("viewModel", "Testing Dependency injection with hilt")
    }
}

