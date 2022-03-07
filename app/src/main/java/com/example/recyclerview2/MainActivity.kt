package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // 2 OBJECTS: 1 FOR LAYOUT MANAGER AND 1 FOR ADAPTER.
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = layoutManager

        adapter = RecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter
    }
}