package com.st.mh.databindingsample.example.ui

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.databinding.ActivityMvvmBinding
import com.st.mh.databindingsample.example.viewmodel.LoginViewModel

fun Activity.newIntentForMvvmActivity() {
    val intent = Intent(this, MvvmActivity::class.java)
    startActivity(intent)
}

class MvvmActivity : AppCompatActivity() {

    lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
        val loginViewModel = LoginViewModel()
        binding.loginViewModel = loginViewModel

    }
}
