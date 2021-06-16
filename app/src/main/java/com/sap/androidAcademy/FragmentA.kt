package com.sap.androidAcademy

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class FragmentA : LoggingFragment() {

    private val viewModel:FragmentViewModel by activityViewModels()

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
            viewModel.setStringValue(view.findViewById<EditText>(R.id.editText).text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(getLogTag(), "Variable is : ${viewModel.retrieveValue()}")
    }

    override fun getLogTag(): String = "Fragment A"

    companion object {

        @JvmStatic
        fun newInstance() =
            FragmentA()
    }
}