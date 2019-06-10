package com.xamlab.com.di

import com.xamlab.com.MainActivity
import com.xamlab.core.di.AppModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AndroidSupportInjectionModule::class,
        AppModule::class]
)
interface AppComponent {
    fun inject(activity: MainActivity)
}