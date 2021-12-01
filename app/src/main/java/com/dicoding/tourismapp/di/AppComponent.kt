package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.di.CoreComponent
import com.dicoding.tourismapp.detail.DetailTourismActivity
import com.dicoding.tourismapp.favorite.FavoriteFragment
import com.dicoding.tourismapp.home.HomeFragment
import dagger.Component


/* langkah 14
* lanjut membuat Component untuk bagian App dengan cara membuat kelas baru dengan
* nama AppComponent di package di dan tulis dengan kode berikut:
* */

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}