package com.bebond.core.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.bebond.core.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)
    }
}