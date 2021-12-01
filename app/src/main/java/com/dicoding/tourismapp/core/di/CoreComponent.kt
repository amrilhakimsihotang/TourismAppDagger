package com.dicoding.tourismapp.core.di

import android.content.Context
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


//langkah 9 dan selanjutnya adalah klik make project
//Langkah ini digunakan supaya Dagger men-generate kode
// yang ada pada Component dan membuat kelas DaggerCoreComponent secara otomatis

@Singleton
@Component(
    modules = [RepositoryModule::class]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideRepository() : ITourismRepository
}