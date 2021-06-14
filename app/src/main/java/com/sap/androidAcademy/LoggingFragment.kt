package com.sap.androidAcademy

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.*

open class LoggingFragment: Fragment() {

    open fun getLogTag(): String = "LoggingFragment"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(getLogTag(), "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(getLogTag(), "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(getLogTag(), "onViewStateRestored")

        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d(getLogTag(), "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(getLogTag(), "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(getLogTag(), "onPause")

        super.onPause()
    }
    override fun onStop() {
        Log.d(getLogTag(), "onStop")

        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(getLogTag(), "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d(getLogTag(), "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(getLogTag(), "onDestroy")
        super.onDestroy()
    }

    override fun onAttach(context: Context) {
        Log.d(getLogTag(), "onAttach")
        super.onAttach(context)
    }

    override fun onDetach() {
        Log.d(getLogTag(), "onDetach")
        super.onDetach()
    }
}