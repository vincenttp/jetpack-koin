package id.vincenttp.projectstructure.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import id.vincenttp.projectstructure.AndroidApp
import javax.inject.Singleton

@Singleton
@Component(modules = [
    (AndroidInjectionModule::class),
    (AppModule::class),
    (ActivityBuilder::class),
    (ApiModule::class)
])

interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application):Builder
        fun build():AppComponent
    }

    fun inject(app: AndroidApp)
}