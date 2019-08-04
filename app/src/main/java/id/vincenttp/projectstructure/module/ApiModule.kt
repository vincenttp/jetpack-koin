package id.vincenttp.projectstructure.module

import id.vincenttp.data.ApiProvider
import id.vincenttp.data.api.UserApi
import org.koin.dsl.module

/**
 * Created by vincenttp on 2019-08-03.
 */

val apiModule = module {
    single { ApiProvider() }
    single {
        get<ApiProvider>()
                .getRetrofit()
                .create(UserApi::class.java)
    }
}