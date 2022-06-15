package com.example.tweet_mood.presetation.find_user

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModel @ViewModelInject constructor() : ViewModel() {

    /* FAZENDO UMA VIEW MODEL FACTORY COMO UM HOMEM DAS CAVERNAS FAZIA
    class ViewModelFactory() : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T{
            if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
                return modelClass.getConstructor().newInstance()
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
    */

    init {
        Log.d("viewModel", "Testing Dependency injection with hilt")
    }
}