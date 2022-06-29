package com.example.tweet_mood.presetation.find_user.view

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FindUserViewModel @Inject constructor() : ViewModel() {

    init {
        Log.d("viewModel", "Testing Dependency injection with hilt")
    }
}

