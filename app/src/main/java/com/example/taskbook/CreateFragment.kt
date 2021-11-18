package com.example.taskbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class CreateFragment : Fragment() {


    private lateinit var nextButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_create, container, false)

        nextButton = view.findViewById(R.id.button_next)

        val taskFragment=TaskFragment()
        nextButton.setOnClickListener{
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_task,taskFragment)
                ?.commit()
        }

        return view

    }

}