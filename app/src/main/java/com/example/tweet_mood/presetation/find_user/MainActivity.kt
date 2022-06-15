package com.example.tweet_mood.presetation.find_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.tweet_mood.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel
        //INSTANCIANDO UM VIEWMODEL COMO UM HOMEM DAS CAVERNAS FAZIA
        //viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        //viewModel = ViewModelProvider(
        //     viewModelStore,
        //     MainActivityViewModel.ViewModelFactory()
        // ).get(MainActivityViewModel::class.java)
    }

}