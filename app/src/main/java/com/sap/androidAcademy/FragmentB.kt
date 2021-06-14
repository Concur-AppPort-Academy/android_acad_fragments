package com.sap.androidAcademy

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentB : LoggingFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(getLogTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun getLogTag(): String = "Fragment B"

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentB()
    }
}