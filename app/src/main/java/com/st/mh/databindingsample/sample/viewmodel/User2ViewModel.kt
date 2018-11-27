package com.st.mh.databindingsample.sample.viewmodel

import android.content.Context
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.example.ui.newIntentForMvvmActivity
import com.st.mh.databindingsample.sample.model.User2

class User2ViewModel(private val context: Context) {
    var user: User2 = User2()


    init {
        user.name.set("lst ")
        user.age.set(38)
        user.color.set(R.color.colorAccent)
    }

    fun onMoveMvvm() {
        context.newIntentForMvvmActivity()
    }
}