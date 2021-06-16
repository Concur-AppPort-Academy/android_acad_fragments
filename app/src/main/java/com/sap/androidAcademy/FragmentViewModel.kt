package com.sap.androidAcademy

import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {

    private var value: String? = null

    fun retrieveValue() = value

    fun setStringValue(newValue: String) {
        value = newValue
    }

}