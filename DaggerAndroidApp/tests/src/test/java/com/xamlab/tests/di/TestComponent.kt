package com.xamlab.tests.di

import com.xamlab.core.di.AppModule
import com.xamlab.core.services.IMainService
import dagger.Component

@Component(
    modules = [
        AppModule::class]
)
interface TestComponent {
    fun mainService(): IMainService
}