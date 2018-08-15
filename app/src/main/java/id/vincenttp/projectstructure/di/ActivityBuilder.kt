package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.vincenttp.projectstructure.feature.SampleActivity
import id.vincenttp.projectstructure.feature.SampleModule
import id.vincenttp.projectstructure.feature.SamplePresenter

@Module
abstract class ActivityBuilder{
    @ContributesAndroidInjector(modules = [(SampleModule::class)])
    abstract fun bindSampleActivity(): SampleActivity
}