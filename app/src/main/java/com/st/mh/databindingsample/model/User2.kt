package com.st.mh.databindingsample.model

import android.databinding.ObservableField
import android.databinding.ObservableInt

class User2 {

    val name = ObservableField<String>()
    val age = ObservableInt()
    val color = ObservableInt()
}