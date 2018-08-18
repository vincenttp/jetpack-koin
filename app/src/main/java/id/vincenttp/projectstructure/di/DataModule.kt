package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.Provides
import id.vincenttp.data.UserRepositoryImpl
import id.vincenttp.domain.repository.UserRepository
import javax.inject.Singleton

@Module
class DataModule{
    @Provides
    @Singleton
    fun provUserData(impl: UserRepositoryImpl): UserRepository = impl
}