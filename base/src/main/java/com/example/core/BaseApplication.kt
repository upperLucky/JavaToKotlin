package com.example.core

import android.app.Application
import android.content.Context

/**
 * created by yunKun.wen on 2020/9/1
 * desc:
 */
class BaseApplication : Application() {
    companion object {
        private var currentApplication: Context? = null
        fun currentApplication() = currentApplication


    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}