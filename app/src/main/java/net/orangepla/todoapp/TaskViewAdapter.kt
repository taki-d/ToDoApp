package net.orangepla.todoapp

import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.text.SimpleDateFormat

class TaskViewAdapter(private val context: Context, private val taskList: List<TaskModel>) :
        RecyclerView.Adapter<TaskViewAdapter.TaskViewHolder>() {


        class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
                val titleTextView: TextView = view.findViewById(R.id.title)
                val dateTextView: TextView = view.findViewById(R.id.date)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
                TaskViewHolder(LayoutInflater.from(context).inflate(R.layout.task_item_list, parent, false))

        override fun getItemCount(): Int = taskList.size

        override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
                val dateFormatter = SimpleDateFormat("MM/dd HH:mm")

                holder.titleTextView.text = taskList[position].title
                holder.dateTextView.text = dateFormatter.format(taskList[position].date)
        }
}

