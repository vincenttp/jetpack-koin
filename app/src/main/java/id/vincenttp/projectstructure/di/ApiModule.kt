package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.Provides
import id.vincenttp.data.ApiProvider
import id.vincenttp.data.api.SampleApi
import javax.inject.Inject

@Module
class ApiModule @Inject constructor(){

    @Provides
    fun provSampleApi() = ApiProvider()
            .getRetrofit()
            .create(SampleApi::class.java)
}