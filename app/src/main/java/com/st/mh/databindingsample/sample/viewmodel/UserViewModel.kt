package com.st.mh.databindingsample.sample.viewmodel

import android.content.Context
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.example.ui.newIntentForMvvmActivity
import com.st.mh.databindingsample.sample.model.User
import com.st.mh.databindingsample.sample.ui.newIntentForTwoWayActivity
import com.st.mh.databindingsample.sample.ui.newIntentForUser1Activity

class UserViewModel(private val context: Context) {
    var model: User = User("lst", 38, R.color.colorAccent)

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