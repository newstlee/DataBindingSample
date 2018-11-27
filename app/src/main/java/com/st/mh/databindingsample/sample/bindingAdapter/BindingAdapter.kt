package com.st.mh.databindingsample.sample.bindingAdapter

import android.databinding.BindingAdapter
import android.view.View
import android.widget.TextView

object BindingAdapter {

    @BindingAdapter("bgColor")
    @JvmStatic
    fun View.setBackgroundColor(color: Int) {
        setBackgroundResource(color)
    }

    @BindingAdapter("visibleOrGone")
    @JvmStatic
    fun View.setVisibleOrGone(show: Boolean) {
        visibility = if(show) View.VISIBLE else View.GONE
    }

    @BindingAdapter("visibleOrInvisible")
    @JvmStatic
    fun View.setVisibleOrInvisible(show: Boolean) {
        visibility = if(show) View.VISIBLE else View.INVISIBLE
    }

    @BindingAdapter("convertText")
    @JvmStatic
    fun TextView.convertIntToString(value: Int) {
        text = value.toString()
    }

    @BindingAdapter("minLineValue", "maxLineValue", requireAll = false)
    @JvmStatic
    fun TextView.setMinMaxLines(min: Int, max: Int) {
        minLines = min
        maxLines = max
    }
}