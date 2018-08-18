package id.vincenttp.domain.iteractor

import id.vincenttp.domain.PostExecutionThread
import id.vincenttp.domain.UseCase
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository
import io.reactivex.Flowable
import javax.inject.Inject

class GetDetail @Inject constructor(
        private val repository: UserRepository,
        postExecutionThread: PostExecutionThread): UseCase<UserModel, GetDetail.Params>(postExecutionThread){
    override fun build(params: Params): Flowable<UserModel> = repository.getDetail(params.username)

    data class Params(val username: String)
}

