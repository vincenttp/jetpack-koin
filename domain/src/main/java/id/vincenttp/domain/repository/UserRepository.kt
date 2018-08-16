package id.vincenttp.data.repository

import id.vincenttp.domain.entities.UserModel
import io.reactivex.Flowable

interface UserRepository{
    fun getDetail(username: String): Flowable<UserModel>
}