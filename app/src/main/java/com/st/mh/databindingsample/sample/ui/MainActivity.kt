package com.st.mh.databindingsample.sample.ui

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayList
import android.databinding.ObservableArrayMap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.databinding.ActivityMainBinding
import com.st.mh.databindingsample.example.ui.newIntentForMvvmActivity
import com.st.mh.databindingsample.sample.adapter.UserAdapter
import com.st.mh.databindingsample.sample.model.User
import com.st.mh.databindingsample.sample.model.User2
import com.st.mh.databindingsample.sample.viewmodel.UserViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var model: User
    lateinit var user: User2
    lateinit var userMap: ObservableArrayMap<String, Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
        binding.model = UserViewModel()

        setRecyclerView()
    }

    fun onMove(view: View) {
        newIntentForTwoWayActivity()
    }

    fun onMoveMvvm(view: View) {
        newIntentForMvvmActivity()
    }

    private fun setRecyclerView() {
        val users = ObservableArrayList<User>()

        users.add(User("Ted", 32, R.color.colorAccent))
        users.add(User("Jane", 20, R.color.colorPrimary))
        users.add(User("Paul", 40, R.color.colorPrimaryDark))
        users.add(User("Ailee", 25, R.color.colorAccent))

        binding.listUser.adapter = UserAdapter(users)
    }
}
