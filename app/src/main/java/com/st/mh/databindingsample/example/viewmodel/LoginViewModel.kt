package com.st.mh.databindingsample.example.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField
import com.st.mh.databindingsample.BR
import com.st.mh.databindingsample.example.model.Login


class LoginViewModel(private var email: String = "", private var password: String = ""): BaseObservable() {

    val errorPassword = ObservableField<String>()
    val errorEmail = ObservableField<String>()
    private var userMutableLiveData: MutableLiveData<Login>? = null

    fun getLogin(): MutableLiveData<Login>? {
        if (userMutableLiveData == null) {
            userMutableLiveData = MutableLiveData()
        }

        return userMutableLiveData
    }

    @Bindable
    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
        notifyPropertyChanged(BR.email)
    }

    @Bindable
    fun getPassword(): String {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
        notifyPropertyChanged(BR.password)
    }

    fun onLoginClicked() {
        val login = Login(getEmail(), getPassword())

        if (!login.isEmailValid()) {
            errorEmail.set("Enter a valid email address")
        } else {
            errorEmail.set(null)
        }

        if (!login.isPasswordLengthValid())
            errorPassword.set("Password Length should be greater than 5")
        else {
            errorPassword.set(null)
        }

        userMutableLiveData?.value = login
    }
 }