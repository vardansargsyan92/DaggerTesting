package com.xamlab.core.services.implementation

import com.xamlab.core.services.IMainService
import com.xamlab.core.services.IMyPrinter
import com.xamlab.core.services.IRestService
import javax.inject.Inject


class MainService @Inject constructor(
    private val restService: IRestService,
    private val myPrinter: IMyPrinter
) : IMainService {

    override fun doSomething() {
        val text = restService.getStringFromApi()
        myPrinter.print(text)
    }
}