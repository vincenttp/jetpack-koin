package id.vincenttp.data

import id.vincenttp.data.api.UserApi
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(val api: UserApi): UserRepository{
    override fun getDetail(username: String): Flowable<UserModel> =
            api.getDetail(username).map {
                UserModel(it.name)
            }

}