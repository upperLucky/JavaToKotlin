package com.example.lesson.entity

/**
 * created by yunKun.wen on 2020/9/1
 * desc:
 */
data class Lesson constructor(var date: String, var content: String, var state: State) {
    enum class State {
        PLAYBACK {
            override fun stateName() = "有回放"
        },
        LIVE {
            override fun stateName() = "正在直播"
        },
        WAIT {
            override fun stateName() = "等待中"
        };

        abstract fun stateName(): String
    }
}