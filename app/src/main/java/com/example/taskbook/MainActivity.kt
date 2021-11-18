package com.example.taskbook

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskFragment = TaskFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_task, taskFragment)
            .commit()

    }


}

