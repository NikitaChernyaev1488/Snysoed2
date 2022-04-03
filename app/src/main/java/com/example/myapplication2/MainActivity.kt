package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("sueta","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sueta","onStart")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Log.d("sueta","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sueta","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sueta","onStop")
    }

    override fun onCreateDescription(): CharSequence? {
        return super.onCreateDescription()
        Log.d("sueta","onCreateDescription")
    } }