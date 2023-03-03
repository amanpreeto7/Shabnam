package com.o7services.shabnam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.o7services.shabnam.databinding.ActivityBaseAdapterBinding

class BaseAdapterActivity : AppCompatActivity(), ClickInterface {
    lateinit var binding: ActivityBaseAdapterBinding
    lateinit var userAdapter: UserAdapter
    var array = arrayListOf<String>("qwer","qwes","asdf")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userAdapter = UserAdapter(array, this)
        binding.listView.adapter = userAdapter
    }

    override fun onClick(string: String) {
        Toast.makeText(this, "clicked item $string", Toast.LENGTH_LONG).show()
    }
}