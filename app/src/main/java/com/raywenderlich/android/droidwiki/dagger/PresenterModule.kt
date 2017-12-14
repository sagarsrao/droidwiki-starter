package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sagar on 12/14/2017.
 */
@Module
class PresenterModule {


    /*Here we specifyed that the HomepagePresenter will be provided  */

    @Provides
    @Singleton
    fun provideHomePagePresenter(homepage:Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

    /*Add @provides annotation method in the presentor module for each source
    * object to be injected*/
    @Provides
    @Singleton
    fun provideEntryHomePagePresenter(wiki: Wiki): EntryPresenter = EntryPresenterImpl(wiki)

}