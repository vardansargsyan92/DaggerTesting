package com.xamlab.core.services.implementation

import com.xamlab.core.services.IRestService
import javax.inject.Inject

class RestService @Inject constructor() : IRestService {
    override fun getStringFromApi(): String {
        return "result from real api method"
    }
}