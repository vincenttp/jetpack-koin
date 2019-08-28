package id.vincenttp.projectstructure.module

import id.vincenttp.domain.interactor.GetDetail
import id.vincenttp.domain.interactor.GetRepo
import org.koin.dsl.module
import org.koin.experimental.builder.factory

/**
 * Created by vincenttp on 2019-08-03.
 */

val useCaseModule = module {
    factory<GetDetail>()
    factory<GetRepo>()
}