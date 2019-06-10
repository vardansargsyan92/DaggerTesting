package com.xamlab.tests

import com.xamlab.core.di.AppModule
import com.xamlab.core.services.IMainService
import com.xamlab.core.services.IRestService
import com.xamlab.tests.di.TestComponent
import it.cosenonjaviste.daggermock.DaggerMock
import it.cosenonjaviste.daggermock.InjectFromComponent
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class UnitTest {

    @get:Rule
    val rule = DaggerMock.rule<TestComponent>(AppModule())

    private var restService: IRestService = mock(IRestService::class.java)


    @InjectFromComponent
    lateinit var mainService: IMainService


    @Test
    fun test1() {
        println("Test 1 ...")
        `when`(restService.getStringFromApi()).thenReturn("test1")
        mainService.doSomething()

    }

    @Test
    fun test2() {
        println("Test 2 ...")
        `when`(restService.getStringFromApi()).thenReturn("test2")
        mainService.doSomething()
    }


}