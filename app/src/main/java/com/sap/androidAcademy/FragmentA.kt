package com.sap.androidAcademy

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener

const val MY_REQUEST_KEY = "MY_REQ_KEY"
const val MY_BUNDLE_KEY = "MY_BUNDLE_KEY"

class FragmentA : LoggingFragment() {

    private var result = "initial";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener(MY_REQUEST_KEY) { _, bundle ->
            result = bundle.getString(MY_BUNDLE_KEY, "empty")
        }
    }

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
            val text = view.findViewById<EditText>(R.id.editText).text.toString()
            view.findViewById<TextView>(R.id.textView).text = "I typed $text"
            setFragmentResult(MY_REQUEST_KEY, bundleOf(MY_BUNDLE_KEY to text))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(getLogTag(), "Variable is : $result")
    }

    override fun getLogTag(): String = "Fragment A"

    companion object {

        @JvmStatic
        fun newInstance() =
            FragmentA()
    }
}