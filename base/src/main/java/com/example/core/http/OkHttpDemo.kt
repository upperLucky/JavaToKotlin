package com.example.core.com.example.core.http

import okhttp3.*
import java.io.IOException


/**
 * created by yunKun.wen on 2020/10/21
 * desc:
 */
class OkHttpDemo {

    var client = OkHttpClient()

    var url = "https://api.github.com/octocat"

    @Throws(IOException::class)
    fun run(url: String) {
        val request: Request = Request.Builder()
                .url(url)
                .build()
        client.newCall(request).enqueue(object : Callback{
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {

            }

        })
    }
}