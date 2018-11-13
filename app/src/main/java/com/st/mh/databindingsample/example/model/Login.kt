package com.st.mh.databindingsample.example.model

import android.util.Patterns

data class Login(private val email: String?, private val password: String?) {

    private fun getEmail(): String {
        email?.let {
            return it
        }

        return ""
    }

    private fun getPassword(): String {
        password?.let {
            return it
        }

        return ""
    }

    fun isEmailValid(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
    }

    fun isPasswordLengthValid(): Boolean {
        return getPassword().length > 5
    }
}
