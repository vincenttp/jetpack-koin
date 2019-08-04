package id.vincenttp.projectstructure

import android.app.Application
import id.vincenttp.projectstructure.module.apiModule
import id.vincenttp.projectstructure.module.dataModule
import id.vincenttp.projectstructure.module.useCaseModule
import id.vincenttp.projectstructure.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AndroidApp)
            modules(
                    listOf(
                            dataModule,
                            apiModule,
                            useCaseModule,
                            viewModelModule
                    )
            )
        }
    }
}