package id.vincenttp.domain.repository

import id.vincenttp.domain.entities.RepoModel
import id.vincenttp.domain.entities.UserModel

interface UserRepository {
    suspend fun getDetail(username: String): UserModel
    suspend fun getRepo(username: String): List<RepoModel>
}