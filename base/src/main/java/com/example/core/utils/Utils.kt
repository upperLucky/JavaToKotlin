package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

/**
 * created by yunKun.wen on 2020/9/1
 * desc:
 */
object Utils {
    private val displayMetrics = Resources.getSystem().displayMetrics

    fun dp2px(dp: Float) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)

    @JvmOverloads
    @JvmStatic
    fun toast(string: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(BaseApplication.currentApplication(), string, duration).show()

    }
}