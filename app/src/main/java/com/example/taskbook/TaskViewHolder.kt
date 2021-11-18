package com.example.taskbook

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(task: String){
    val taskTextView: TextView = itemView.findViewById(R.id.task_text_view)
        taskTextView.text=task

    }
}