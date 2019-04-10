package com.example.testapp.presentation.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testapp.presentation.di.scope.Application
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
@Application
class ViewModelFactory @Inject constructor(private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>) = creators[modelClass]?.let { it.get() as T }
        ?: throw IllegalArgumentException("Unknown model class $modelClass")
}
