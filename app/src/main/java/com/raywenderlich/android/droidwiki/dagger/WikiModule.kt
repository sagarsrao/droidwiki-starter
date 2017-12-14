package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sagar on 12/14/2017.
 */
@Module
class WikiModule {

    @Provides
    @Singleton
    fun provideHomepage(api: WikiApi) = Homepage(api)

    @Provides
    @Singleton
    fun provideWiki(api: WikiApi) = Wiki(api)
}