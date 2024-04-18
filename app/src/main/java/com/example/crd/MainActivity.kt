package com.example.crd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val items = listOf(
            ItemData(R.drawable.ic_launcher_foreground, "Text 1"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 2"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3"),
            ItemData(R.drawable.ic_launcher_foreground, "Text 3")
        )

        recyclerView.adapter = MyAdapter(items)
    }

}