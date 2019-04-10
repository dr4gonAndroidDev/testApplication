package com.example.testapp.presentation.di.module

import com.example.testapp.presentation.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ViewBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}