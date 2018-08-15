package id.vincenttp.data.api

import retrofit2.http.GET

interface SampleApi{
    @GET()
    fun getDetail()
}