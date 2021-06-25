package com.raywenderlich.shesajamebelishemajamebeli

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.raywenderlich.shesajamebelishemajamebeli.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: NumberAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bind()
    }


    private fun bind(){
        adapter = NumberAdapter()
        binding.recyclerview.layoutManager = GridLayoutManager(this,3)
        binding.recyclerview.adapter = adapter

    }
}