package id.vincenttp.projectstructure.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import id.vincenttp.domain.PostExecutionThread
import id.vincenttp.projectstructure.UIThread
import javax.inject.Singleton

@Module
class AppModule{
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread = uiThread
}