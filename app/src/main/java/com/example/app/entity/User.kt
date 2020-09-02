package com.example.app.entity

/**
 * created by yunKun.wen on 2020/8/31
 * desc:
 */
class User constructor(var username: String?,
                       var password: String?,
                       var code: String?) {

    constructor() : this(null, null, null)
}