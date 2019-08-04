package id.vincenttp.projectstructure.module

import id.vincenttp.projectstructure.feature.SampleViewModel
import id.vincenttp.projectstructure.feature.fragment.SampleFrViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by vincenttp on 2019-08-04.
 */

val viewModelModule = module {
    viewModel<SampleViewModel>()
    viewModel<SampleFrViewModel>()
}