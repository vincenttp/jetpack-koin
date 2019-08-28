package id.vincenttp.domain.interactor

import id.vincenttp.domain.BaseUseCase
import id.vincenttp.domain.entities.RepoModel
import id.vincenttp.domain.repository.UserRepository

/**
 * Created by vincenttp on 2019-08-05.
 */

class GetRepo(private val repository: UserRepository) : BaseUseCase<List<RepoModel>, GetRepo.Params>() {
    override suspend fun build(params: Params): List<RepoModel> = repository.getRepo(params.username)

    data class Params(val username: String)
}