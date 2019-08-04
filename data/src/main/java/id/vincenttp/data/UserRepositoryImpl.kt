package id.vincenttp.data

import id.vincenttp.data.api.UserApi
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository

class UserRepositoryImpl(val api: UserApi) : UserRepository {
    override suspend fun getDetail(username: String): UserModel = UserModel(api.getDetail(username).name)
    /*override fun getDetail(username: String): Flowable<UserModel> =
            api.getDetail(username).map {
                UserModel(it.name)
            }*/

}