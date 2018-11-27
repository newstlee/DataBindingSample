package com.st.mh.databindingsample.sample.viewmodel

import android.content.Context
import android.databinding.ObservableArrayMap
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.example.ui.newIntentForMvvmActivity
import com.st.mh.databindingsample.sample.model.User
import com.st.mh.databindingsample.sample.model.User2
import com.st.mh.databindingsample.sample.ui.newIntentForTwoWayActivity
import com.st.mh.databindingsample.sample.ui.newIntentForUser1Activity

class UserViewModel(private val context: Context) {
    var model: User = User("lst", 38, R.color.colorAccent)
    var user: User2 = User2()
    var userMap: ObservableArrayMap<String, Any>


    init {
        user.name.set("lst ")
        user.age.set(38)
        user.color.set(R.color.colorAccent)

        userMap = ObservableArrayMap()
        userMap["name"] = "Google"
        userMap["age"] = 17
        userMap["color"] = R.color.colorAccent
    }

    fun onMoveUser1() {
        context.newIntentForUser1Activity()
    }

    fun onMoveTwoWay() {
        context.newIntentForTwoWayActivity()
    }

    fun onMoveMvvm() {
        context.newIntentForMvvmActivity()
    }
}