package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.domain.usecase.TourismInteractor
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

//langkah 13
/*
*  buat module baru untuk mem-provide TourismUseCase.
* Caranya buat kelas baru dengan nama AppModule di package di dan tambahkan kode berikut:
* */

@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}