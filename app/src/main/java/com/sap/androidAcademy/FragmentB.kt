package com.sap.androidAcademy

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener

class FragmentB : LoggingFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(getLogTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragmentResultListener(MY_REQUEST_KEY) { _, bundle ->
            val result = bundle.getString(MY_BUNDLE_KEY, "none")
            view.findViewById<TextView>(R.id.fragment_b_text).text = "I said $result"
        }
    }

    override fun getLogTag(): String = "Fragment B"

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentB()
    }
}