package com.reynafigueroa.wisewallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        if (savedInstanceState == null){
            loadFragment(LoginFragment())
        }
    }

    private fun loadFragment(fragment: LoginFragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.authContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}