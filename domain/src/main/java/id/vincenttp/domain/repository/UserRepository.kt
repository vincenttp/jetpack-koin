package id.vincenttp.domain.repository

import id.vincenttp.domain.entities.UserModel

interface UserRepository {
    suspend fun getDetail(username: String): UserModel
}