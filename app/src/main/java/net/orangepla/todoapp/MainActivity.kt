package net.orangepla.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskList = mutableListOf<TaskModel>()
        repeat((0..100).count()) { taskList.add(TaskModel("sample title", Date())) }

        fab.setOnClickListener {
            startActivity(Intent(this, TaskAdd::class.java))
        }

        findViewById<RecyclerView>(R.id.task_recycler_view).also { recyclerView: RecyclerView ->
            recyclerView.adapter = TaskViewAdapter(this, taskList)
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }
}
