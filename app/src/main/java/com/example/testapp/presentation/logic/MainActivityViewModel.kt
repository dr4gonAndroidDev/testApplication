package com.example.testapp.presentation.logic

import androidx.lifecycle.ViewModel
import com.example.testapp.presentation.adapters.DateAdapter
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val dateAdapter: DateAdapter
): ViewModel() {

}