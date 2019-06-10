package com.xamlab.com

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xamlab.com.di.AppComponent
import com.xamlab.com.di.DaggerAppComponent
import com.xamlab.core.services.implementation.MainService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainService: MainService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component: AppComponent = DaggerAppComponent.create()
        component.inject(this)
        mainService.doSomething()
    }
}
