package com.example.testapp.presentation.adapters

import java.util.*
import javax.inject.Inject

class DateAdapterImpl @Inject constructor(date: Date = Calendar.getInstance().time) : DateAdapter {
    private lateinit var date: Date

    override fun getCurrentDate() = date
}