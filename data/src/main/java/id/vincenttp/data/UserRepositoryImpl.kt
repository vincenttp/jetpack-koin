package id.vincenttp.data

import id.vincenttp.data.api.UserApi
import id.vincenttp.domain.entities.RepoModel
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository

class UserRepositoryImpl(val api: UserApi) : UserRepository {
    override suspend fun getRepo(username: String): List<RepoModel> = api.getRepos(username).map {
        RepoModel(it.id, it.name, it.html_url)
    }

    override suspend fun getDetail(username: String): UserModel = UserModel(api.getDetail(username).name)

}