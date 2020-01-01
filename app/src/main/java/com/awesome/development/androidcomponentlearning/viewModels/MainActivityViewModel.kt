package com.awesome.development.androidcomponentlearning.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainActivityViewModel : ViewModel() {

    private lateinit var a: MutableLiveData<Int>



    private lateinit var clickCountA:MutableLiveData<Int>
    private lateinit var clickCountB:MutableLiveData<Int>

    fun getInitialCountA(): Int {
        if (clickCountA.value)
        return clickCountA
    }

    fun getInitialCountB(): Int {
        return clickCountB
    }

    fun getCurrentCountA(): Int {
        clickCountA += 1
        return clickCountA
    }

    fun getCurrentCountB(): Int {
        clickCountB += 1
        return clickCountB
    }



}