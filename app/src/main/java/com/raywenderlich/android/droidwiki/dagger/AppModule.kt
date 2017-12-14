package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sagar on 12/14/2017.
 *
 *
 */

/*The @Module annotation tells Dagger that the AppModule
 class will provide dependencies for a part of the
 application*/
@Module
class AppModule(private val app: Application) {
    @Provides
    @Singleton
    fun provideContext(): Context = app


}


