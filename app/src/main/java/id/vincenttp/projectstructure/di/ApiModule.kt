package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.Provides
import id.vincenttp.data.ApiProvider
import id.vincenttp.data.api.UserApi
import javax.inject.Inject

@Module
class ApiModule @Inject constructor(){

    @Provides
    fun provSampleApi(): UserApi = ApiProvider()
            .getRetrofit()
            .create(UserApi::class.java)
}