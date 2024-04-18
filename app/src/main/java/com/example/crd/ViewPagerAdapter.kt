package com.example.crd

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    private val items = listOf("Card 1", "Card 2", "Card 3")

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment =
        CardFragment.newInstance(items[position])
}