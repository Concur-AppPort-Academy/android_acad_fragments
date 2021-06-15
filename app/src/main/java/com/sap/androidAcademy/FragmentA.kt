package com.sap.androidAcademy

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FragmentA : LoggingFragment() {

    var value: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(getLogTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.save_btn).setOnClickListener {
            view.findViewById<TextView>(R.id.textView).text = view.findViewById<EditText>(R.id.editText).text.toString()
            value = view.findViewById<EditText>(R.id.editText).text.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState?.getString("VALUE")?.let {
            value = it
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        value?.let {
            outState.putString("VALUE", it)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(getLogTag(), "Variable is : ${value}")
    }

    override fun getLogTag(): String = "Fragment A"

    companion object {

        @JvmStatic
        fun newInstance() =
            FragmentA()
    }
}