package com.sap.androidAcademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

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

    private val fragments = listOf(
        FragmentHolder("Fragment A") {FragmentA.newInstance()},
        FragmentHolder("Fragment B") {FragmentB.newInstance()}
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        viewPager.adapter = ViewPageAdapter(fragments, this)

        TabLayoutMediator(tabLayout, viewPager){tab: TabLayout.Tab, position: Int ->
            tab.text = fragments[position].name
        }.attach()

    }
}

data class FragmentHolder(val name: String, val newInstance: () -> Fragment)