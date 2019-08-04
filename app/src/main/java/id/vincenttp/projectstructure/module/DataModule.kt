package id.vincenttp.projectstructure.module

import id.vincenttp.data.UserRepositoryImpl
import id.vincenttp.domain.repository.UserRepository
import org.koin.dsl.module

/**
 * Created by vincenttp on 2019-08-03.
 */

val dataModule = module {
    single<UserRepository> { UserRepositoryImpl(get()) }
}