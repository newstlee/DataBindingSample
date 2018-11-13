package com.st.mh.databindingsample.sample.viewmodel

import android.databinding.ObservableArrayMap
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.sample.model.User
import com.st.mh.databindingsample.sample.model.User2

class UserViewModel {
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

    fun onOkClicked() {
        model.setName("BaseObserbavle")

        user.name.set("ObservableField")

        userMap["name"] = "ObservableArrayMap"
    }

    fun onCancelClicked() {
        model.setName("Cancel BaseObserbavle")

        user.name.set("Cancel ObservableField")

        userMap["name"] = "Cancel ObservableArrayMap"
    }
}