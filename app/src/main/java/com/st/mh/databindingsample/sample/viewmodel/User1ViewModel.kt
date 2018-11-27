package com.st.mh.databindingsample.sample.viewmodel

import android.content.Context
import android.databinding.ObservableArrayMap
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.sample.model.User
import com.st.mh.databindingsample.sample.ui.newIntentForUser2Activity

class User1ViewModel(private val context: Context) {
    var model: User = User("lst", 38, R.color.colorAccent)
    var userMap: ObservableArrayMap<String, Any> = ObservableArrayMap()


    init {
        userMap["name"] = "Google"
        userMap["age"] = 17
        userMap["color"] = R.color.colorAccent
    }

    fun onMoveUser2() {
        context.newIntentForUser2Activity()
    }

    fun onOkClicked() {
        model.setName("BaseObserbavle")
        userMap["name"] = "ObservableArrayMap"
    }

    fun onCancelClicked() {
        model.setName("Cancel BaseObserbavle")
        userMap["name"] = "Cancel ObservableArrayMap"
    }
}