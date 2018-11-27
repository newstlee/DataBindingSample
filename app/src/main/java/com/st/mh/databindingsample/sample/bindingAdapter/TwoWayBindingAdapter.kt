package com.st.mh.databindingsample.sample.bindingAdapter

import android.databinding.BindingAdapter
import android.databinding.InverseBindingAdapter
import android.databinding.InverseBindingListener
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView

object TwoWayBindingAdapter {

    @BindingAdapter("text")
    @JvmStatic
    fun setTextString(view: TextView, text: String?) {
        val old = view.text.toString()
        if (old != text) {
            view.text = text
        }
    }

    @BindingAdapter("textAttrChanged")
    @JvmStatic
    fun setTextWatcher(view: TextView, textAttrChanged: InverseBindingListener?) {
        view.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                textAttrChanged?.onChange() // 고정적으로 사용하는 코드임.
            }
        })
    }

    @InverseBindingAdapter(attribute = "text", event = "textAttrChanged")
    @JvmStatic
    fun getTextString(view: TextView): String {
        return view.text.toString()
    }
}