package com.st.mh.databindingsample.sample.model

import android.databinding.ObservableField


class TwoWayModel {
    val contents: ObservableField<String> = ObservableField()
    val contents2: ObservableField<String> = ObservableField("custom 2 way")
}