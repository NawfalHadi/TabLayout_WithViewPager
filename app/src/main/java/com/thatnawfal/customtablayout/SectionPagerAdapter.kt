package com.thatnawfal.customtablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPagerAdapter(activity : AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        var fragment = SingleFragment()

        fragment.arguments = Bundle().apply {
            putInt(SingleFragment.ARG_SECTION_NUMBER, position + 1)
        }

        return fragment

    }
}