package com.st.mh.databindingsample.sample.ui

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.databinding.ActivityUser2Binding
import com.st.mh.databindingsample.sample.viewmodel.User2ViewModel

fun Context.newIntentForUser2Activity() {
    val intent = Intent(this, User2Activity::class.java)
    startActivity(intent)
}

class User2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityUser2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user2)
        binding.activity = this
        binding.model = User2ViewModel(this)
    }
}
