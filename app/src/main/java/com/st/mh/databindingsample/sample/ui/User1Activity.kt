package com.st.mh.databindingsample.sample.ui

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.databinding.ActivityUser1Binding
import com.st.mh.databindingsample.sample.viewmodel.User1ViewModel

fun Context.newIntentForUser1Activity() {
    val intent = Intent(this, User1Activity::class.java)
    startActivity(intent)
}

class User1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityUser1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user1)
        binding.activity = this
        binding.model = User1ViewModel(this)
    }
}
