package com.sap.androidAcademy

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class FragmentB : LoggingFragment() {

    private val viewModel:FragmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(getLogTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.fragment_b_text).text = "I said ${viewModel.retrieveValue()}"
    }

    override fun getLogTag(): String = "Fragment B"

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentB()
    }
}