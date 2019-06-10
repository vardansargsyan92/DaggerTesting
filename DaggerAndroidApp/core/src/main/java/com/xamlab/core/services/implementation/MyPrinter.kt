package com.xamlab.core.services.implementation

import com.xamlab.core.services.IMyPrinter
import javax.inject.Inject

class MyPrinter @Inject constructor() : IMyPrinter {
    override fun print(s: String) {
        println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
        println(s)
        println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
        println(" ")
    }
}