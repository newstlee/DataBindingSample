package com.st.mh.databindingsample.sample.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.st.mh.databindingsample.BR

data class User(private var name: String, private var age: Int, val color: Int) : BaseObservable() {

    // Bindable 주석은 컴파일 중에 BR 클래스 파일에 항목을 생성함. BR 클래스 파일은 모듈 패키지에 생성됨.
    @Bindable
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
        notifyPropertyChanged(BR.name)
    }

    @Bindable
    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
        notifyPropertyChanged(BR.age)
    }
}