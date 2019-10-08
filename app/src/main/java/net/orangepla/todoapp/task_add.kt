package net.orangepla.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_task_add.*

class task_add : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_add)

        save_task_button.setOnClickListener({
            // todo
            // save task to database
            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}
