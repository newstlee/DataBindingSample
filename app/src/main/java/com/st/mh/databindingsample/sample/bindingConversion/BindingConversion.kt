package com.st.mh.databindingsample.sample.bindingConversion

import android.databinding.BindingConversion
import android.view.View

object BindingConversion {

    /*
     usage : android:visibility="@{model.user.name != null}"
    */
    @BindingConversion
    @JvmStatic
    fun convertBooleanToViewVisibility(isVisible: Boolean): Int {
        return if (isVisible) View.VISIBLE else View.GONE
    }
}