package com.st.mh.databindingsample

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayList
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.st.mh.databindingsample.adapter.UserAdapter
import com.st.mh.databindingsample.databinding.ActivityMainBinding
import com.st.mh.databindingsample.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        setRecyclerView()
    }

    fun onOk(view: View) {
        binding.textTitle.text = "OK"
    }

    fun onCancel(view: View) {
        binding.textTitle.text = "Cancel"
    }

    private fun setRecyclerView() {
        val users = ObservableArrayList<User>()

        users.add(User("Ted", 32))
        users.add(User("Jane", 20))
        users.add(User("Paul", 40))
        users.add(User("Ailee", 25))

        binding.listUser.adapter = UserAdapter(users)
    }
}
