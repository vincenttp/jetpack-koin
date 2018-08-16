package id.vincenttp.data.api

import retrofit2.http.GET
import retrofit2.http.Path

interface SampleApi{
    @GET("/users/{username}")
    fun getDetail(@Path("username") username: String)
}