package com.sap.androidAcademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.fragment_a_btn).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_viewport, FragmentA.newInstance()
            ).addToBackStack(null).commit()

        }
        findViewById<Button>(R.id.fragment_b_btn).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_viewport, FragmentB.newInstance()
            ).addToBackStack(null).commit()
        }
    }
}