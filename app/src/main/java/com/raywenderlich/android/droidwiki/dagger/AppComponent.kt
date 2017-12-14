package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by sagar on 12/14/2017.
 */
/*You’ve told Dagger that AppComponent is a singleton component interface for the app.
 The @Component annotation takes a list of modules as an input.*/
/**/
@Singleton
@Component(modules = [AppModule::class,PresenterModule::class,NetworkModule::class,WikiModule::class])

interface AppComponent {

    /*Here we specifyed that the Homepage activity will require injection  from AppComponent*/
    fun inject(target: HomepageActivity)

    /*Add inject() in AppComponent with  target class Arguement*/
    fun inject(target: SearchActivity)
}


