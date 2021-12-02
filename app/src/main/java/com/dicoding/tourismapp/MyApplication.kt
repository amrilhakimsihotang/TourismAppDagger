package com.dicoding.tourismapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//langkah 15


//LANGKAH-1 PRAKTEK HILT
/*
@InstallIn pada masing-masing module yang terdapat pada core dengan value ApplicationComponent
-RepositoryModule
-NetworkModule
-DatabaseModule
* */
@HiltAndroidApp
open class MyApplication : Application() {

  /*  private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    } */
}