package com.example.testapp.presentation.di.module

import com.example.testapp.presentation.adapters.DateAdapterImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
class AdapterModule {

    @Binds
    @Singleton
    fun providesDateAdapter() = DateAdapterImpl()

}