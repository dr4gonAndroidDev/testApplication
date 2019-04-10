package com.example.testapp.presentation.adapters

import java.util.*
import javax.inject.Inject

class DateAdapterImpl @Inject constructor() : DateAdapter {
    override fun getCurrentDate() = Calendar.getInstance().time!!
}