package id.vincenttp.data.api

import id.vincenttp.data.response.UserResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface SampleApi{
    @GET("users/{username}")
    fun getDetail(@Path("username") username: String): Flowable<UserResponse>
}