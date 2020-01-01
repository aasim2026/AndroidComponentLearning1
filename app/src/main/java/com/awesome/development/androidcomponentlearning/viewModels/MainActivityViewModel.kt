package com.awesome.development.androidcomponentlearning.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.properties.Delegates


class MainActivityViewModel : ViewModel() {

    private var clickCountAA = 0
    private var clickCountBB =0
    fun getInitialCountA(): Int {

        return clickCountAA
    }

    fun getInitialCountB(): Int {
        return clickCountBB
    }

    fun getCurrentCountA(): Int {
        clickCountAA += 1
        return clickCountAA
    }

    fun getCurrentCountB(): Int {
        clickCountBB += 1
        return clickCountBB
    }



}