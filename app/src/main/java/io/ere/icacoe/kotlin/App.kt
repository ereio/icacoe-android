package io.ere.icacoe.kotlin

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import org.rekotlin.Store

private var mInstance: AppController? = null

class AppController : Application() {
    override fun onCreate() {
        super.onCreate() 

        mInstance = this
    }
}
