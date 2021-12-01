package com.dicoding.tourismapp.di

import javax.inject.Scope

//10..Namun karena kelas AppComponent akan depend (tergantung) pada CoreComponent,
// kedua kelas ini harus memiliki scope yang berbeda.
// Untuk itu kita akan membuat custom scope sendiri.
// Buat class baru dengan nama AppScope di package di. Kemudian isi dengan kode berikut

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope