package id.vincenttp.projectstructure.feature

import dagger.Module
import dagger.Provides
import id.vincenttp.projectstructure.base.BasePresenter

@Module
class SampleModule{
    @Provides
    fun provSamplePresenter(presenter: SamplePresenter): BasePresenter = presenter
}