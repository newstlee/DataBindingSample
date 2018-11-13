package com.st.mh.databindingsample.example.ui

import android.app.Activity
import android.arch.lifecycle.Observer
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        loginViewModel.getLogin()?.observe(this, Observer { it ->
            it?.let { login ->
                if (login.getEmail().isNotEmpty() || login.getPassword().isNotEmpty())
                    Toast.makeText(applicationContext, "email : " + it.getEmail()
                            + " password " + it.getPassword(), Toast.LENGTH_SHORT).show()
            }
        })
    }
}
