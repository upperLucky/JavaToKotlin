package com.example.core.com.example.core.http

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * created by yunKun.wen on 2020/10/14
 * desc:
 */
interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<Repo>>
}