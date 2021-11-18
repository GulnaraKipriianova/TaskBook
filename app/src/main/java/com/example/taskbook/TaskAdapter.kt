package com.example.taskbook

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

private lateinit var shareButton: Button

class TaskAdapter(private val taskList:List<String>): RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val taskItemView=
            LayoutInflater.from(parent.context)
                .inflate(R.layout.task_item_view,parent,false)

        return  TaskViewHolder(taskItemView)
    }


    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task= taskList[position]
        holder.bind(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}