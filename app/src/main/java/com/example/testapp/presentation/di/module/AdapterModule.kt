package com.example.testapp.presentation.di.module

import com.example.testapp.presentation.adapters.DateAdapter
import com.example.testapp.presentation.adapters.DateAdapterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class AdapterModule {

    @Singleton
    @Provides
    fun providesDateAdapter(dateAdapterImpl: DateAdapterImpl): DateAdapter = dateAdapterImpl
}