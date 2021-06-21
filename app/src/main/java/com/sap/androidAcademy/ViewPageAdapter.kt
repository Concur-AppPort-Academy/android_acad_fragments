package com.sap.androidAcademy

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(
    val fragmentHolders: List<FragmentHolder>,
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return fragmentHolders.size
    }

    override fun createFragment(position: Int): Fragment {
        return if(position < itemCount){
            fragmentHolders[position].newInstance()
        }else{
            FragmentA.newInstance()
        }
    }
}