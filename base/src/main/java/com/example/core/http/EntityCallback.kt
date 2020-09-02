package com.example.core.http

/**
 * created by yunKun.wen on 2020/9/1
 * desc:
 */
interface EntityCallback<T> {
    fun onSuccess(entity: T)
    fun onFailure(message: String)
}