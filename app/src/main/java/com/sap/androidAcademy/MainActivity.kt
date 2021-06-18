package com.sap.androidAcademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    /**
     * 1. add dependencies
     *  implementation "androidx.viewpager2:viewpager2:1.0.0"
     *  implementation 'com.google.android.material:material:1.4.0-rc01'
     * 2. add tabLayout and pagerview2
     * 3. create holder for fragment data
     * 4. create adapter
     * 5. bind everything together
     * 6. enjoy running app ;-)
     *
     */

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