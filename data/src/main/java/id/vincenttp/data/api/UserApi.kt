package id.vincenttp.data.api

import id.vincenttp.data.response.RepoRespon
import id.vincenttp.data.response.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path


interface UserApi {
    @GET("users/{username}")
    suspend fun getDetail(@Path("username") username: String): UserResponse

    @GET("users/{username}/repos")
    suspend fun getRepos(@Path("username") username: String): List<RepoRespon>
}