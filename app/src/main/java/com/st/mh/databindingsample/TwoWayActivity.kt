package com.st.mh.databindingsample

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.st.mh.databindingsample.databinding.ActivityTwoWayBinding
import com.st.mh.databindingsample.model.TwoWayModel

fun Activity.newIntentForTwoWayActivity() {
    val intent = Intent(this, TwoWayActivity::class.java)
    startActivity(intent)
}

class TwoWayActivity : AppCompatActivity() {
    lateinit var binding: ActivityTwoWayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way)
        binding.vm = TwoWayModel()
    }
}
