package com.o7services.shabnam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.o7services.shabnam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter : ArrayAdapter<String>
    var array = arrayListOf("qwer","asdf","zxcv")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, array)
        binding.listView.adapter = adapter
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "clicked Item ${array[position]}", Toast.LENGTH_LONG).show()
            array.add("afsg")
            adapter.notifyDataSetChanged()
        }
    }
}