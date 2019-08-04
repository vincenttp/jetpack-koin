package id.vincenttp.domain.interactor

import id.vincenttp.domain.BaseUseCase
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository

class GetDetail(private val repository: UserRepository) : BaseUseCase<UserModel, GetDetail.Params>() {
    override suspend fun build(params: Params): UserModel = repository.getDetail(params.username)

    data class Params(val username: String)
}

