package com.b3nedikt.reword.example

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import dev.b3nedikt.app_locale.AppLocale
import dev.b3nedikt.viewpump.ViewPumpContextWrapper

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(AppLocale.wrap(newBase)))
    }

    override fun getResources(): Resources {
        return AppLocale.wrap(baseContext).resources
    }
}
