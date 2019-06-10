package com.xamlab.core.di

import com.xamlab.core.services.IMainService
import com.xamlab.core.services.IMyPrinter
import com.xamlab.core.services.IRestService
import com.xamlab.core.services.implementation.MainService
import com.xamlab.core.services.implementation.MyPrinter
import com.xamlab.core.services.implementation.RestService
import dagger.Module
import dagger.Provides

@Module
open class AppModule {

    @Provides
    open fun provideRestService(restService: RestService): IRestService = restService

    @Provides
    open fun provideMyPrinter(printer: MyPrinter): IMyPrinter = printer

    @Provides
    open fun provideMainService(mainService: MainService): IMainService = mainService
}