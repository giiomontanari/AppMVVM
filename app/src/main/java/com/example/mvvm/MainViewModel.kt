package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var repository = PersonRepository();

    private var mTextWelcome = MutableLiveData<String>();
    var textWelcome = mTextWelcome;

    private var mLogin = MutableLiveData<Boolean>();
    var login = mLogin;

    init {
        mTextWelcome.value = "Hello World!"
    }

    fun login(name: String) {
        val ret = repository.login(name);
        mLogin.value = ret;
    }
}