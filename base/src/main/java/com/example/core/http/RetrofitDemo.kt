package com.example.core.com.example.core.http

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

/**
 * created by yunKun.wen on 2020/10/14
 * desc:
 */
class RetrofitDemo {

    fun net() {
        var retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build()

        var service: GitHubService = retrofit.create(GitHubService::class.java)
        val repos: Call<List<Repo>> = service.listRepos("octocat")
        repos.enqueue(object : Callback<List<Repo>> {
            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {

            }

            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {

            }

        })

    }

}